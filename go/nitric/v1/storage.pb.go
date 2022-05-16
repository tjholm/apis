// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.20.1
// source: proto/storage/v1/storage.proto

package v1

import (
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Operation
type StoragePreSignUrlRequest_Operation int32

const (
	StoragePreSignUrlRequest_READ  StoragePreSignUrlRequest_Operation = 0
	StoragePreSignUrlRequest_WRITE StoragePreSignUrlRequest_Operation = 1
)

// Enum value maps for StoragePreSignUrlRequest_Operation.
var (
	StoragePreSignUrlRequest_Operation_name = map[int32]string{
		0: "READ",
		1: "WRITE",
	}
	StoragePreSignUrlRequest_Operation_value = map[string]int32{
		"READ":  0,
		"WRITE": 1,
	}
)

func (x StoragePreSignUrlRequest_Operation) Enum() *StoragePreSignUrlRequest_Operation {
	p := new(StoragePreSignUrlRequest_Operation)
	*p = x
	return p
}

func (x StoragePreSignUrlRequest_Operation) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (StoragePreSignUrlRequest_Operation) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_storage_v1_storage_proto_enumTypes[0].Descriptor()
}

func (StoragePreSignUrlRequest_Operation) Type() protoreflect.EnumType {
	return &file_proto_storage_v1_storage_proto_enumTypes[0]
}

func (x StoragePreSignUrlRequest_Operation) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use StoragePreSignUrlRequest_Operation.Descriptor instead.
func (StoragePreSignUrlRequest_Operation) EnumDescriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{6, 0}
}

// Request to put (create/update) a storage item
type StorageWriteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Nitric name of the bucket to store in
	//  this will be automatically resolved to the provider specific bucket identifier.
	BucketName string `protobuf:"bytes,1,opt,name=bucket_name,json=bucketName,proto3" json:"bucket_name,omitempty"`
	// Key to store the item under
	Key string `protobuf:"bytes,2,opt,name=key,proto3" json:"key,omitempty"`
	// bytes array to store
	Body []byte `protobuf:"bytes,3,opt,name=body,proto3" json:"body,omitempty"`
}

func (x *StorageWriteRequest) Reset() {
	*x = StorageWriteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageWriteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageWriteRequest) ProtoMessage() {}

func (x *StorageWriteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageWriteRequest.ProtoReflect.Descriptor instead.
func (*StorageWriteRequest) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{0}
}

func (x *StorageWriteRequest) GetBucketName() string {
	if x != nil {
		return x.BucketName
	}
	return ""
}

func (x *StorageWriteRequest) GetKey() string {
	if x != nil {
		return x.Key
	}
	return ""
}

func (x *StorageWriteRequest) GetBody() []byte {
	if x != nil {
		return x.Body
	}
	return nil
}

// Result of putting a storage item
type StorageWriteResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *StorageWriteResponse) Reset() {
	*x = StorageWriteResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageWriteResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageWriteResponse) ProtoMessage() {}

func (x *StorageWriteResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageWriteResponse.ProtoReflect.Descriptor instead.
func (*StorageWriteResponse) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{1}
}

// Request to retrieve a storage item
type StorageReadRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Nitric name of the bucket to retrieve from
	//  this will be automatically resolved to the provider specific bucket identifier.
	BucketName string `protobuf:"bytes,1,opt,name=bucket_name,json=bucketName,proto3" json:"bucket_name,omitempty"`
	// Key of item to retrieve
	Key string `protobuf:"bytes,2,opt,name=key,proto3" json:"key,omitempty"`
}

func (x *StorageReadRequest) Reset() {
	*x = StorageReadRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageReadRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageReadRequest) ProtoMessage() {}

func (x *StorageReadRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageReadRequest.ProtoReflect.Descriptor instead.
func (*StorageReadRequest) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{2}
}

func (x *StorageReadRequest) GetBucketName() string {
	if x != nil {
		return x.BucketName
	}
	return ""
}

func (x *StorageReadRequest) GetKey() string {
	if x != nil {
		return x.Key
	}
	return ""
}

// Returned storage item
type StorageReadResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The body bytes of the retrieved storage item
	Body []byte `protobuf:"bytes,1,opt,name=body,proto3" json:"body,omitempty"`
}

func (x *StorageReadResponse) Reset() {
	*x = StorageReadResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageReadResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageReadResponse) ProtoMessage() {}

func (x *StorageReadResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageReadResponse.ProtoReflect.Descriptor instead.
func (*StorageReadResponse) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{3}
}

func (x *StorageReadResponse) GetBody() []byte {
	if x != nil {
		return x.Body
	}
	return nil
}

// Request to delete a storage item
type StorageDeleteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Name of the bucket to delete from
	BucketName string `protobuf:"bytes,1,opt,name=bucket_name,json=bucketName,proto3" json:"bucket_name,omitempty"`
	// Key of item to delete
	Key string `protobuf:"bytes,2,opt,name=key,proto3" json:"key,omitempty"`
}

func (x *StorageDeleteRequest) Reset() {
	*x = StorageDeleteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageDeleteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageDeleteRequest) ProtoMessage() {}

func (x *StorageDeleteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageDeleteRequest.ProtoReflect.Descriptor instead.
func (*StorageDeleteRequest) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{4}
}

func (x *StorageDeleteRequest) GetBucketName() string {
	if x != nil {
		return x.BucketName
	}
	return ""
}

func (x *StorageDeleteRequest) GetKey() string {
	if x != nil {
		return x.Key
	}
	return ""
}

// Result of deleting a storage item
type StorageDeleteResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *StorageDeleteResponse) Reset() {
	*x = StorageDeleteResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageDeleteResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageDeleteResponse) ProtoMessage() {}

func (x *StorageDeleteResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageDeleteResponse.ProtoReflect.Descriptor instead.
func (*StorageDeleteResponse) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{5}
}

// Request to generate a pre-signed URL for a file to perform a specific operation, such as read or write.
type StoragePreSignUrlRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Nitric name of the bucket to retrieve from
	//  this will be automatically resolved to the provider specific bucket identifier.
	BucketName string `protobuf:"bytes,1,opt,name=bucket_name,json=bucketName,proto3" json:"bucket_name,omitempty"`
	// Key of item to generate the signed URL for.
	// The URL and the token it contains will only be valid for operations on this resource specifically.
	Key       string                             `protobuf:"bytes,2,opt,name=key,proto3" json:"key,omitempty"`
	Operation StoragePreSignUrlRequest_Operation `protobuf:"varint,3,opt,name=operation,proto3,enum=nitric.storage.v1.StoragePreSignUrlRequest_Operation" json:"operation,omitempty"`
	// Expiry time in seconds for the token included in the signed URL.
	//  Time starts from when the access token is generated, not when this request is made.
	//  e.g. time.Now().Add(expiry * time.Second) on the server
	Expiry uint32 `protobuf:"varint,4,opt,name=expiry,proto3" json:"expiry,omitempty"`
}

func (x *StoragePreSignUrlRequest) Reset() {
	*x = StoragePreSignUrlRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StoragePreSignUrlRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StoragePreSignUrlRequest) ProtoMessage() {}

func (x *StoragePreSignUrlRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StoragePreSignUrlRequest.ProtoReflect.Descriptor instead.
func (*StoragePreSignUrlRequest) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{6}
}

func (x *StoragePreSignUrlRequest) GetBucketName() string {
	if x != nil {
		return x.BucketName
	}
	return ""
}

func (x *StoragePreSignUrlRequest) GetKey() string {
	if x != nil {
		return x.Key
	}
	return ""
}

func (x *StoragePreSignUrlRequest) GetOperation() StoragePreSignUrlRequest_Operation {
	if x != nil {
		return x.Operation
	}
	return StoragePreSignUrlRequest_READ
}

func (x *StoragePreSignUrlRequest) GetExpiry() uint32 {
	if x != nil {
		return x.Expiry
	}
	return 0
}

type StoragePreSignUrlResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The pre-signed url, restricted to the operation, resource and expiry time specified in the request.
	Url string `protobuf:"bytes,1,opt,name=url,proto3" json:"url,omitempty"`
}

func (x *StoragePreSignUrlResponse) Reset() {
	*x = StoragePreSignUrlResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StoragePreSignUrlResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StoragePreSignUrlResponse) ProtoMessage() {}

func (x *StoragePreSignUrlResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StoragePreSignUrlResponse.ProtoReflect.Descriptor instead.
func (*StoragePreSignUrlResponse) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{7}
}

func (x *StoragePreSignUrlResponse) GetUrl() string {
	if x != nil {
		return x.Url
	}
	return ""
}

type StorageListFilesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	BucketName string `protobuf:"bytes,1,opt,name=bucket_name,json=bucketName,proto3" json:"bucket_name,omitempty"`
}

func (x *StorageListFilesRequest) Reset() {
	*x = StorageListFilesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageListFilesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageListFilesRequest) ProtoMessage() {}

func (x *StorageListFilesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageListFilesRequest.ProtoReflect.Descriptor instead.
func (*StorageListFilesRequest) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{8}
}

func (x *StorageListFilesRequest) GetBucketName() string {
	if x != nil {
		return x.BucketName
	}
	return ""
}

type File struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Key string `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
}

func (x *File) Reset() {
	*x = File{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *File) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*File) ProtoMessage() {}

func (x *File) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use File.ProtoReflect.Descriptor instead.
func (*File) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{9}
}

func (x *File) GetKey() string {
	if x != nil {
		return x.Key
	}
	return ""
}

type StorageListFilesResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// keys of the files in the bucket
	Files []*File `protobuf:"bytes,1,rep,name=files,proto3" json:"files,omitempty"`
}

func (x *StorageListFilesResponse) Reset() {
	*x = StorageListFilesResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_storage_v1_storage_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StorageListFilesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StorageListFilesResponse) ProtoMessage() {}

func (x *StorageListFilesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_storage_v1_storage_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StorageListFilesResponse.ProtoReflect.Descriptor instead.
func (*StorageListFilesResponse) Descriptor() ([]byte, []int) {
	return file_proto_storage_v1_storage_proto_rawDescGZIP(), []int{10}
}

func (x *StorageListFilesResponse) GetFiles() []*File {
	if x != nil {
		return x.Files
	}
	return nil
}

var File_proto_storage_v1_storage_proto protoreflect.FileDescriptor

var file_proto_storage_v1_storage_proto_rawDesc = []byte{
	0x0a, 0x1e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f,
	0x76, 0x31, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x11, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65,
	0x2e, 0x76, 0x31, 0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x81, 0x01, 0x0a,
	0x13, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x57, 0x72, 0x69, 0x74, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x0b, 0x62, 0x75, 0x63, 0x6b, 0x65, 0x74, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x1a, 0xfa, 0x42, 0x17, 0x72, 0x15,
	0x28, 0x80, 0x02, 0x32, 0x10, 0x5e, 0x5c, 0x77, 0x2b, 0x28, 0x5b, 0x2e, 0x5c, 0x2d, 0x5d, 0x5c,
	0x77, 0x2b, 0x29, 0x2a, 0x24, 0x52, 0x0a, 0x62, 0x75, 0x63, 0x6b, 0x65, 0x74, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x19, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07,
	0xfa, 0x42, 0x04, 0x72, 0x02, 0x10, 0x01, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x12, 0x0a, 0x04,
	0x62, 0x6f, 0x64, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x62, 0x6f, 0x64, 0x79,
	0x22, 0x16, 0x0a, 0x14, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x57, 0x72, 0x69, 0x74, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x6c, 0x0a, 0x12, 0x53, 0x74, 0x6f, 0x72,
	0x61, 0x67, 0x65, 0x52, 0x65, 0x61, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b,
	0x0a, 0x0b, 0x62, 0x75, 0x63, 0x6b, 0x65, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x1a, 0xfa, 0x42, 0x17, 0x72, 0x15, 0x28, 0x80, 0x02, 0x32, 0x10, 0x5e,
	0x5c, 0x77, 0x2b, 0x28, 0x5b, 0x2e, 0x5c, 0x2d, 0x5d, 0x5c, 0x77, 0x2b, 0x29, 0x2a, 0x24, 0x52,
	0x0a, 0x62, 0x75, 0x63, 0x6b, 0x65, 0x74, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x19, 0x0a, 0x03, 0x6b,
	0x65, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02, 0x10,
	0x01, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x22, 0x29, 0x0a, 0x13, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67,
	0x65, 0x52, 0x65, 0x61, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x12, 0x0a,
	0x04, 0x62, 0x6f, 0x64, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x62, 0x6f, 0x64,
	0x79, 0x22, 0x6e, 0x0a, 0x14, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x0b, 0x62, 0x75, 0x63,
	0x6b, 0x65, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x1a,
	0xfa, 0x42, 0x17, 0x72, 0x15, 0x28, 0x80, 0x02, 0x32, 0x10, 0x5e, 0x5c, 0x77, 0x2b, 0x28, 0x5b,
	0x2e, 0x5c, 0x2d, 0x5d, 0x5c, 0x77, 0x2b, 0x29, 0x2a, 0x24, 0x52, 0x0a, 0x62, 0x75, 0x63, 0x6b,
	0x65, 0x74, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x19, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02, 0x10, 0x01, 0x52, 0x03, 0x6b, 0x65,
	0x79, 0x22, 0x17, 0x0a, 0x15, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x81, 0x02, 0x0a, 0x18, 0x53,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x50, 0x72, 0x65, 0x53, 0x69, 0x67, 0x6e, 0x55, 0x72, 0x6c,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x0b, 0x62, 0x75, 0x63, 0x6b, 0x65,
	0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x1a, 0xfa, 0x42,
	0x17, 0x72, 0x15, 0x28, 0x80, 0x02, 0x32, 0x10, 0x5e, 0x5c, 0x77, 0x2b, 0x28, 0x5b, 0x2e, 0x5c,
	0x2d, 0x5d, 0x5c, 0x77, 0x2b, 0x29, 0x2a, 0x24, 0x52, 0x0a, 0x62, 0x75, 0x63, 0x6b, 0x65, 0x74,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x19, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02, 0x10, 0x01, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12,
	0x53, 0x0a, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x35, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72,
	0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x50, 0x72,
	0x65, 0x53, 0x69, 0x67, 0x6e, 0x55, 0x72, 0x6c, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x12, 0x16, 0x0a, 0x06, 0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x0d, 0x52, 0x06, 0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x22, 0x20, 0x0a, 0x09,
	0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x08, 0x0a, 0x04, 0x52, 0x45, 0x41,
	0x44, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x57, 0x52, 0x49, 0x54, 0x45, 0x10, 0x01, 0x22, 0x2d,
	0x0a, 0x19, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x50, 0x72, 0x65, 0x53, 0x69, 0x67, 0x6e,
	0x55, 0x72, 0x6c, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x10, 0x0a, 0x03, 0x75,
	0x72, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x75, 0x72, 0x6c, 0x22, 0x56, 0x0a,
	0x17, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x69, 0x6c, 0x65,
	0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x0b, 0x62, 0x75, 0x63, 0x6b,
	0x65, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x1a, 0xfa,
	0x42, 0x17, 0x72, 0x15, 0x28, 0x80, 0x02, 0x32, 0x10, 0x5e, 0x5c, 0x77, 0x2b, 0x28, 0x5b, 0x2e,
	0x5c, 0x2d, 0x5d, 0x5c, 0x77, 0x2b, 0x29, 0x2a, 0x24, 0x52, 0x0a, 0x62, 0x75, 0x63, 0x6b, 0x65,
	0x74, 0x4e, 0x61, 0x6d, 0x65, 0x22, 0x18, 0x0a, 0x04, 0x46, 0x69, 0x6c, 0x65, 0x12, 0x10, 0x0a,
	0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x22,
	0x49, 0x0a, 0x18, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x69,
	0x6c, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x2d, 0x0a, 0x05, 0x66,
	0x69, 0x6c, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6e, 0x69, 0x74,
	0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x46,
	0x69, 0x6c, 0x65, 0x52, 0x05, 0x66, 0x69, 0x6c, 0x65, 0x73, 0x32, 0xed, 0x03, 0x0a, 0x0e, 0x53,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x55, 0x0a,
	0x04, 0x52, 0x65, 0x61, 0x64, 0x12, 0x25, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67,
	0x65, 0x52, 0x65, 0x61, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x6e,
	0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x52, 0x65, 0x61, 0x64, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x58, 0x0a, 0x05, 0x57, 0x72, 0x69, 0x74, 0x65, 0x12, 0x26, 0x2e,
	0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76,
	0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x57, 0x72, 0x69, 0x74, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x27, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67,
	0x65, 0x57, 0x72, 0x69, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x5b,
	0x0a, 0x06, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x12, 0x27, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69,
	0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f,
	0x72, 0x61, 0x67, 0x65, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x28, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x67, 0x0a, 0x0a, 0x50,
	0x72, 0x65, 0x53, 0x69, 0x67, 0x6e, 0x55, 0x72, 0x6c, 0x12, 0x2b, 0x2e, 0x6e, 0x69, 0x74, 0x72,
	0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x50, 0x72, 0x65, 0x53, 0x69, 0x67, 0x6e, 0x55, 0x72, 0x6c, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2c, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x50, 0x72, 0x65, 0x53, 0x69, 0x67, 0x6e, 0x55, 0x72, 0x6c, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x64, 0x0a, 0x09, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x69, 0x6c, 0x65,
	0x73, 0x12, 0x2a, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x4c, 0x69, 0x73,
	0x74, 0x46, 0x69, 0x6c, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2b, 0x2e,
	0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76,
	0x31, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x69, 0x6c,
	0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x6a, 0x0a, 0x1a, 0x69, 0x6f,
	0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x42, 0x08, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67,
	0x65, 0x73, 0x50, 0x01, 0x5a, 0x0c, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2f, 0x76, 0x31, 0x3b,
	0x76, 0x31, 0xaa, 0x02, 0x17, 0x4e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x2e, 0x53, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0xca, 0x02, 0x17, 0x4e,
	0x69, 0x74, 0x72, 0x69, 0x63, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x53, 0x74, 0x6f, 0x72,
	0x61, 0x67, 0x65, 0x5c, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_storage_v1_storage_proto_rawDescOnce sync.Once
	file_proto_storage_v1_storage_proto_rawDescData = file_proto_storage_v1_storage_proto_rawDesc
)

func file_proto_storage_v1_storage_proto_rawDescGZIP() []byte {
	file_proto_storage_v1_storage_proto_rawDescOnce.Do(func() {
		file_proto_storage_v1_storage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_storage_v1_storage_proto_rawDescData)
	})
	return file_proto_storage_v1_storage_proto_rawDescData
}

var file_proto_storage_v1_storage_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_proto_storage_v1_storage_proto_msgTypes = make([]protoimpl.MessageInfo, 11)
var file_proto_storage_v1_storage_proto_goTypes = []interface{}{
	(StoragePreSignUrlRequest_Operation)(0), // 0: nitric.storage.v1.StoragePreSignUrlRequest.Operation
	(*StorageWriteRequest)(nil),             // 1: nitric.storage.v1.StorageWriteRequest
	(*StorageWriteResponse)(nil),            // 2: nitric.storage.v1.StorageWriteResponse
	(*StorageReadRequest)(nil),              // 3: nitric.storage.v1.StorageReadRequest
	(*StorageReadResponse)(nil),             // 4: nitric.storage.v1.StorageReadResponse
	(*StorageDeleteRequest)(nil),            // 5: nitric.storage.v1.StorageDeleteRequest
	(*StorageDeleteResponse)(nil),           // 6: nitric.storage.v1.StorageDeleteResponse
	(*StoragePreSignUrlRequest)(nil),        // 7: nitric.storage.v1.StoragePreSignUrlRequest
	(*StoragePreSignUrlResponse)(nil),       // 8: nitric.storage.v1.StoragePreSignUrlResponse
	(*StorageListFilesRequest)(nil),         // 9: nitric.storage.v1.StorageListFilesRequest
	(*File)(nil),                            // 10: nitric.storage.v1.File
	(*StorageListFilesResponse)(nil),        // 11: nitric.storage.v1.StorageListFilesResponse
}
var file_proto_storage_v1_storage_proto_depIdxs = []int32{
	0,  // 0: nitric.storage.v1.StoragePreSignUrlRequest.operation:type_name -> nitric.storage.v1.StoragePreSignUrlRequest.Operation
	10, // 1: nitric.storage.v1.StorageListFilesResponse.files:type_name -> nitric.storage.v1.File
	3,  // 2: nitric.storage.v1.StorageService.Read:input_type -> nitric.storage.v1.StorageReadRequest
	1,  // 3: nitric.storage.v1.StorageService.Write:input_type -> nitric.storage.v1.StorageWriteRequest
	5,  // 4: nitric.storage.v1.StorageService.Delete:input_type -> nitric.storage.v1.StorageDeleteRequest
	7,  // 5: nitric.storage.v1.StorageService.PreSignUrl:input_type -> nitric.storage.v1.StoragePreSignUrlRequest
	9,  // 6: nitric.storage.v1.StorageService.ListFiles:input_type -> nitric.storage.v1.StorageListFilesRequest
	4,  // 7: nitric.storage.v1.StorageService.Read:output_type -> nitric.storage.v1.StorageReadResponse
	2,  // 8: nitric.storage.v1.StorageService.Write:output_type -> nitric.storage.v1.StorageWriteResponse
	6,  // 9: nitric.storage.v1.StorageService.Delete:output_type -> nitric.storage.v1.StorageDeleteResponse
	8,  // 10: nitric.storage.v1.StorageService.PreSignUrl:output_type -> nitric.storage.v1.StoragePreSignUrlResponse
	11, // 11: nitric.storage.v1.StorageService.ListFiles:output_type -> nitric.storage.v1.StorageListFilesResponse
	7,  // [7:12] is the sub-list for method output_type
	2,  // [2:7] is the sub-list for method input_type
	2,  // [2:2] is the sub-list for extension type_name
	2,  // [2:2] is the sub-list for extension extendee
	0,  // [0:2] is the sub-list for field type_name
}

func init() { file_proto_storage_v1_storage_proto_init() }
func file_proto_storage_v1_storage_proto_init() {
	if File_proto_storage_v1_storage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_storage_v1_storage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageWriteRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageWriteResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageReadRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageReadResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageDeleteRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageDeleteResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StoragePreSignUrlRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StoragePreSignUrlResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageListFilesRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*File); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_storage_v1_storage_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StorageListFilesResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_storage_v1_storage_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   11,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_storage_v1_storage_proto_goTypes,
		DependencyIndexes: file_proto_storage_v1_storage_proto_depIdxs,
		EnumInfos:         file_proto_storage_v1_storage_proto_enumTypes,
		MessageInfos:      file_proto_storage_v1_storage_proto_msgTypes,
	}.Build()
	File_proto_storage_v1_storage_proto = out.File
	file_proto_storage_v1_storage_proto_rawDesc = nil
	file_proto_storage_v1_storage_proto_goTypes = nil
	file_proto_storage_v1_storage_proto_depIdxs = nil
}
