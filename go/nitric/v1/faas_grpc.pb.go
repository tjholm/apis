// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.1
// source: proto/faas/v1/faas.proto

package v1

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// FaasServiceClient is the client API for FaasService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FaasServiceClient interface {
	// Begin streaming triggers/response to/from the membrane
	TriggerStream(ctx context.Context, opts ...grpc.CallOption) (FaasService_TriggerStreamClient, error)
}

type faasServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewFaasServiceClient(cc grpc.ClientConnInterface) FaasServiceClient {
	return &faasServiceClient{cc}
}

func (c *faasServiceClient) TriggerStream(ctx context.Context, opts ...grpc.CallOption) (FaasService_TriggerStreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &FaasService_ServiceDesc.Streams[0], "/nitric.faas.v1.FaasService/TriggerStream", opts...)
	if err != nil {
		return nil, err
	}
	x := &faasServiceTriggerStreamClient{stream}
	return x, nil
}

type FaasService_TriggerStreamClient interface {
	Send(*ClientMessage) error
	Recv() (*ServerMessage, error)
	grpc.ClientStream
}

type faasServiceTriggerStreamClient struct {
	grpc.ClientStream
}

func (x *faasServiceTriggerStreamClient) Send(m *ClientMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *faasServiceTriggerStreamClient) Recv() (*ServerMessage, error) {
	m := new(ServerMessage)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// FaasServiceServer is the server API for FaasService service.
// All implementations should embed UnimplementedFaasServiceServer
// for forward compatibility
type FaasServiceServer interface {
	// Begin streaming triggers/response to/from the membrane
	TriggerStream(FaasService_TriggerStreamServer) error
}

// UnimplementedFaasServiceServer should be embedded to have forward compatible implementations.
type UnimplementedFaasServiceServer struct {
}

func (UnimplementedFaasServiceServer) TriggerStream(FaasService_TriggerStreamServer) error {
	return status.Errorf(codes.Unimplemented, "method TriggerStream not implemented")
}

// UnsafeFaasServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FaasServiceServer will
// result in compilation errors.
type UnsafeFaasServiceServer interface {
	mustEmbedUnimplementedFaasServiceServer()
}

func RegisterFaasServiceServer(s grpc.ServiceRegistrar, srv FaasServiceServer) {
	s.RegisterService(&FaasService_ServiceDesc, srv)
}

func _FaasService_TriggerStream_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(FaasServiceServer).TriggerStream(&faasServiceTriggerStreamServer{stream})
}

type FaasService_TriggerStreamServer interface {
	Send(*ServerMessage) error
	Recv() (*ClientMessage, error)
	grpc.ServerStream
}

type faasServiceTriggerStreamServer struct {
	grpc.ServerStream
}

func (x *faasServiceTriggerStreamServer) Send(m *ServerMessage) error {
	return x.ServerStream.SendMsg(m)
}

func (x *faasServiceTriggerStreamServer) Recv() (*ClientMessage, error) {
	m := new(ClientMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// FaasService_ServiceDesc is the grpc.ServiceDesc for FaasService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var FaasService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "nitric.faas.v1.FaasService",
	HandlerType: (*FaasServiceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "TriggerStream",
			Handler:       _FaasService_TriggerStream_Handler,
			ServerStreams: true,
			ClientStreams: true,
		},
	},
	Metadata: "proto/faas/v1/faas.proto",
}
