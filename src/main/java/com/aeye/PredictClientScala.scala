package com.aeye


import io.grpc.ManagedChannelBuilder
import org.tensorflow.framework.{TensorProto, TensorShapeProto}
import tensorflow.serving.Model.ModelSpec
import tensorflow.serving.Predict.PredictRequest
import tensorflow.serving.PredictionServiceGrpc

/**
  * Created by SWGR
  */
object PredictClientScala {

  def main(args: Array[String]): Unit = {
    val host = "34.210.46.167"
    val port = 8896
    val channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build()
    val blockingStub = PredictionServiceGrpc.newBlockingStub(channel)

    import java.io.File
    import javax.imageio.ImageIO

    val image = ImageIO.read(new File("/Users/wanchunwang/Desktop/platform/aeye/datasets/val_prepared/41709_right.jpeg"))

    import Array._
    val arr = ofDim[Float](1,512, 512,3)

    for (i <- 0 to 511) {
      for ( j <- 0 to 511) {
        val rgb = image.getRGB(i, j)
        val iAlpha = rgb >> 24 & 0xff
        val iRed = rgb >> 16 & 0xff
        val iGreen = rgb >> 8 & 0xff
        val iBlue = rgb & 0xff
        arr(0)(i)(j)(0) = iRed
        arr(0)(i)(j)(0) = iGreen
        arr(0)(i)(j)(0) = iBlue
      }
    }

    val tpImgBuilder = TensorProto.newBuilder()
    tpImgBuilder.setDtype(org.tensorflow.framework.DataType.DT_FLOAT)
    val tensorShapeBuilder = TensorShapeProto.newBuilder()
    tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(1).build())
    tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(512).build())
    tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(512).build())
    tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(3).build())
    tpImgBuilder.setTensorShape(tensorShapeBuilder.build())
    val tensorProto = tpImgBuilder.build()

    val modelSpec = ModelSpec.newBuilder().setName("aeye").setSignatureName("predict_images").build()

    val requestBuilder = PredictRequest.newBuilder()

    requestBuilder.putInputs("images", tensorProto)
    requestBuilder.setModelSpec(modelSpec)
    val request = requestBuilder.build()

    val response = blockingStub.predict(request)
    println(response)

  }

}
