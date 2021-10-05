// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.26.0
// 	protoc        v3.18.1
// source: proto/secret/v1/secret.proto

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

// Request to put a secret to a Secret Store
type SecretPutRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The Secret to put to the Secret store
	Secret *Secret `protobuf:"bytes,1,opt,name=secret,proto3" json:"secret,omitempty"`
	// The value to assign to that secret
	Value []byte `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
}

func (x *SecretPutRequest) Reset() {
	*x = SecretPutRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_secret_v1_secret_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretPutRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretPutRequest) ProtoMessage() {}

func (x *SecretPutRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_secret_v1_secret_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretPutRequest.ProtoReflect.Descriptor instead.
func (*SecretPutRequest) Descriptor() ([]byte, []int) {
	return file_proto_secret_v1_secret_proto_rawDescGZIP(), []int{0}
}

func (x *SecretPutRequest) GetSecret() *Secret {
	if x != nil {
		return x.Secret
	}
	return nil
}

func (x *SecretPutRequest) GetValue() []byte {
	if x != nil {
		return x.Value
	}
	return nil
}

// Result from putting the secret to a Secret Store
type SecretPutResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The id of the secret
	SecretVersion *SecretVersion `protobuf:"bytes,1,opt,name=secret_version,json=secretVersion,proto3" json:"secret_version,omitempty"`
}

func (x *SecretPutResponse) Reset() {
	*x = SecretPutResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_secret_v1_secret_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretPutResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretPutResponse) ProtoMessage() {}

func (x *SecretPutResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_secret_v1_secret_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretPutResponse.ProtoReflect.Descriptor instead.
func (*SecretPutResponse) Descriptor() ([]byte, []int) {
	return file_proto_secret_v1_secret_proto_rawDescGZIP(), []int{1}
}

func (x *SecretPutResponse) GetSecretVersion() *SecretVersion {
	if x != nil {
		return x.SecretVersion
	}
	return nil
}

// Request to get a secret from a Secret Store
type SecretAccessRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The id of the secret
	SecretVersion *SecretVersion `protobuf:"bytes,1,opt,name=secret_version,json=secretVersion,proto3" json:"secret_version,omitempty"`
}

func (x *SecretAccessRequest) Reset() {
	*x = SecretAccessRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_secret_v1_secret_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretAccessRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretAccessRequest) ProtoMessage() {}

func (x *SecretAccessRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_secret_v1_secret_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretAccessRequest.ProtoReflect.Descriptor instead.
func (*SecretAccessRequest) Descriptor() ([]byte, []int) {
	return file_proto_secret_v1_secret_proto_rawDescGZIP(), []int{2}
}

func (x *SecretAccessRequest) GetSecretVersion() *SecretVersion {
	if x != nil {
		return x.SecretVersion
	}
	return nil
}

// The secret response
type SecretAccessResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The version of the secret that was requested
	SecretVersion *SecretVersion `protobuf:"bytes,1,opt,name=secret_version,json=secretVersion,proto3" json:"secret_version,omitempty"`
	// The value of the secret
	Value []byte `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
}

func (x *SecretAccessResponse) Reset() {
	*x = SecretAccessResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_secret_v1_secret_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretAccessResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretAccessResponse) ProtoMessage() {}

func (x *SecretAccessResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_secret_v1_secret_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretAccessResponse.ProtoReflect.Descriptor instead.
func (*SecretAccessResponse) Descriptor() ([]byte, []int) {
	return file_proto_secret_v1_secret_proto_rawDescGZIP(), []int{3}
}

func (x *SecretAccessResponse) GetSecretVersion() *SecretVersion {
	if x != nil {
		return x.SecretVersion
	}
	return nil
}

func (x *SecretAccessResponse) GetValue() []byte {
	if x != nil {
		return x.Value
	}
	return nil
}

// The secret container
type Secret struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The secret name
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *Secret) Reset() {
	*x = Secret{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_secret_v1_secret_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Secret) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Secret) ProtoMessage() {}

func (x *Secret) ProtoReflect() protoreflect.Message {
	mi := &file_proto_secret_v1_secret_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Secret.ProtoReflect.Descriptor instead.
func (*Secret) Descriptor() ([]byte, []int) {
	return file_proto_secret_v1_secret_proto_rawDescGZIP(), []int{4}
}

func (x *Secret) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// A version of a secret
type SecretVersion struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Reference to the secret container
	Secret *Secret `protobuf:"bytes,1,opt,name=secret,proto3" json:"secret,omitempty"`
	// The secret version
	Version string `protobuf:"bytes,2,opt,name=version,proto3" json:"version,omitempty"` //map<string, string> labels = 4; //Tags for GCP and azure,
}

func (x *SecretVersion) Reset() {
	*x = SecretVersion{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_secret_v1_secret_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretVersion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretVersion) ProtoMessage() {}

func (x *SecretVersion) ProtoReflect() protoreflect.Message {
	mi := &file_proto_secret_v1_secret_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretVersion.ProtoReflect.Descriptor instead.
func (*SecretVersion) Descriptor() ([]byte, []int) {
	return file_proto_secret_v1_secret_proto_rawDescGZIP(), []int{5}
}

func (x *SecretVersion) GetSecret() *Secret {
	if x != nil {
		return x.Secret
	}
	return nil
}

func (x *SecretVersion) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

var File_proto_secret_v1_secret_proto protoreflect.FileDescriptor

var file_proto_secret_v1_secret_proto_rawDesc = []byte{
	0x0a, 0x1c, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2f, 0x76,
	0x31, 0x2f, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10,
	0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31,
	0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x64, 0x0a, 0x10, 0x53, 0x65, 0x63,
	0x72, 0x65, 0x74, 0x50, 0x75, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3a, 0x0a,
	0x06, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x18, 0x2e,
	0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31,
	0x2e, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x42, 0x08, 0xfa, 0x42, 0x05, 0x8a, 0x01, 0x02, 0x10,
	0x01, 0x52, 0x06, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c,
	0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x22,
	0x5b, 0x0a, 0x11, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x50, 0x75, 0x74, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x46, 0x0a, 0x0e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5f, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6e,
	0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e,
	0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x0d, 0x73,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x67, 0x0a, 0x13,
	0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x50, 0x0a, 0x0e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5f, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6e, 0x69,
	0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x42, 0x08, 0xfa, 0x42,
	0x05, 0x8a, 0x01, 0x02, 0x10, 0x01, 0x52, 0x0d, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x89, 0x01, 0x0a, 0x14, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74,
	0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x50,
	0x0a, 0x0e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e,
	0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74,
	0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x42, 0x08, 0xfa, 0x42, 0x05, 0x8a, 0x01, 0x02, 0x10,
	0x01, 0x52, 0x0d, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x12, 0x1f, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x42,
	0x09, 0xfa, 0x42, 0x06, 0x7a, 0x04, 0x18, 0xc0, 0xbb, 0x01, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x22, 0x38, 0x0a, 0x06, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x12, 0x2e, 0x0a, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x1a, 0xfa, 0x42, 0x17, 0x72, 0x15,
	0x28, 0x80, 0x02, 0x32, 0x10, 0x5e, 0x5c, 0x77, 0x2b, 0x28, 0x5b, 0x2e, 0x5c, 0x2d, 0x5d, 0x5c,
	0x77, 0x2b, 0x29, 0x2a, 0x24, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x6e, 0x0a, 0x0d, 0x53,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x3a, 0x0a, 0x06,
	0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x6e,
	0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e,
	0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x42, 0x08, 0xfa, 0x42, 0x05, 0x8a, 0x01, 0x02, 0x10, 0x01,
	0x52, 0x06, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x12, 0x21, 0x0a, 0x07, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02,
	0x10, 0x01, 0x52, 0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x32, 0xb8, 0x01, 0x0a, 0x0d,
	0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x4e, 0x0a,
	0x03, 0x50, 0x75, 0x74, 0x12, 0x22, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65,
	0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x50, 0x75,
	0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x23, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69,
	0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x63, 0x72,
	0x65, 0x74, 0x50, 0x75, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x57, 0x0a,
	0x06, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x12, 0x25, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63,
	0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x63, 0x72, 0x65,
	0x74, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26,
	0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x76,
	0x31, 0x2e, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x66, 0x0a, 0x19, 0x69, 0x6f, 0x2e, 0x6e, 0x69, 0x74,
	0x72, 0x69, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74,
	0x2e, 0x76, 0x31, 0x42, 0x07, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x73, 0x50, 0x01, 0x5a, 0x0c,
	0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2f, 0x76, 0x31, 0x3b, 0x76, 0x31, 0xaa, 0x02, 0x16, 0x4e,
	0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x53, 0x65, 0x63, 0x72,
	0x65, 0x74, 0x2e, 0x76, 0x31, 0xca, 0x02, 0x16, 0x4e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x5c, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5c, 0x56, 0x31, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_secret_v1_secret_proto_rawDescOnce sync.Once
	file_proto_secret_v1_secret_proto_rawDescData = file_proto_secret_v1_secret_proto_rawDesc
)

func file_proto_secret_v1_secret_proto_rawDescGZIP() []byte {
	file_proto_secret_v1_secret_proto_rawDescOnce.Do(func() {
		file_proto_secret_v1_secret_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_secret_v1_secret_proto_rawDescData)
	})
	return file_proto_secret_v1_secret_proto_rawDescData
}

var file_proto_secret_v1_secret_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_proto_secret_v1_secret_proto_goTypes = []interface{}{
	(*SecretPutRequest)(nil),     // 0: nitric.secret.v1.SecretPutRequest
	(*SecretPutResponse)(nil),    // 1: nitric.secret.v1.SecretPutResponse
	(*SecretAccessRequest)(nil),  // 2: nitric.secret.v1.SecretAccessRequest
	(*SecretAccessResponse)(nil), // 3: nitric.secret.v1.SecretAccessResponse
	(*Secret)(nil),               // 4: nitric.secret.v1.Secret
	(*SecretVersion)(nil),        // 5: nitric.secret.v1.SecretVersion
}
var file_proto_secret_v1_secret_proto_depIdxs = []int32{
	4, // 0: nitric.secret.v1.SecretPutRequest.secret:type_name -> nitric.secret.v1.Secret
	5, // 1: nitric.secret.v1.SecretPutResponse.secret_version:type_name -> nitric.secret.v1.SecretVersion
	5, // 2: nitric.secret.v1.SecretAccessRequest.secret_version:type_name -> nitric.secret.v1.SecretVersion
	5, // 3: nitric.secret.v1.SecretAccessResponse.secret_version:type_name -> nitric.secret.v1.SecretVersion
	4, // 4: nitric.secret.v1.SecretVersion.secret:type_name -> nitric.secret.v1.Secret
	0, // 5: nitric.secret.v1.SecretService.Put:input_type -> nitric.secret.v1.SecretPutRequest
	2, // 6: nitric.secret.v1.SecretService.Access:input_type -> nitric.secret.v1.SecretAccessRequest
	1, // 7: nitric.secret.v1.SecretService.Put:output_type -> nitric.secret.v1.SecretPutResponse
	3, // 8: nitric.secret.v1.SecretService.Access:output_type -> nitric.secret.v1.SecretAccessResponse
	7, // [7:9] is the sub-list for method output_type
	5, // [5:7] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_proto_secret_v1_secret_proto_init() }
func file_proto_secret_v1_secret_proto_init() {
	if File_proto_secret_v1_secret_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_secret_v1_secret_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretPutRequest); i {
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
		file_proto_secret_v1_secret_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretPutResponse); i {
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
		file_proto_secret_v1_secret_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretAccessRequest); i {
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
		file_proto_secret_v1_secret_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretAccessResponse); i {
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
		file_proto_secret_v1_secret_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Secret); i {
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
		file_proto_secret_v1_secret_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretVersion); i {
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
			RawDescriptor: file_proto_secret_v1_secret_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_secret_v1_secret_proto_goTypes,
		DependencyIndexes: file_proto_secret_v1_secret_proto_depIdxs,
		MessageInfos:      file_proto_secret_v1_secret_proto_msgTypes,
	}.Build()
	File_proto_secret_v1_secret_proto = out.File
	file_proto_secret_v1_secret_proto_rawDesc = nil
	file_proto_secret_v1_secret_proto_goTypes = nil
	file_proto_secret_v1_secret_proto_depIdxs = nil
}
