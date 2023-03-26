package org.maz;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.maz.grpc.OpenapiexampleGrpc;
import org.maz.grpc.OpenapiexampleOuterClass;
import org.maz.grpc.SampleDataResponse;

@GRpcService
public class GrpcServer extends OpenapiexampleGrpc.OpenapiexampleImplBase {

  @Override
  public void getSampleData(Empty request, StreamObserver<SampleDataResponse> responseObserver) {
    responseObserver.onCompleted();
  }
}
