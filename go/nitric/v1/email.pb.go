// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.26.0
// 	protoc        v3.19.0
// source: proto/email/v1/email.proto

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

// Content of an email message
type EmailBody struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Plain text content for non-HTML supporting email clients
	Text string `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	// Optional HTML email content
	Html string `protobuf:"bytes,2,opt,name=html,proto3" json:"html,omitempty"`
}

func (x *EmailBody) Reset() {
	*x = EmailBody{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_email_v1_email_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EmailBody) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EmailBody) ProtoMessage() {}

func (x *EmailBody) ProtoReflect() protoreflect.Message {
	mi := &file_proto_email_v1_email_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EmailBody.ProtoReflect.Descriptor instead.
func (*EmailBody) Descriptor() ([]byte, []int) {
	return file_proto_email_v1_email_proto_rawDescGZIP(), []int{0}
}

func (x *EmailBody) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

func (x *EmailBody) GetHtml() string {
	if x != nil {
		return x.Html
	}
	return ""
}

// Request to queue an email message
type EmailSendRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	From    string     `protobuf:"bytes,1,opt,name=from,proto3" json:"from,omitempty"`
	To      []string   `protobuf:"bytes,2,rep,name=to,proto3" json:"to,omitempty"`
	Cc      []string   `protobuf:"bytes,3,rep,name=cc,proto3" json:"cc,omitempty"`
	Bcc     []string   `protobuf:"bytes,4,rep,name=bcc,proto3" json:"bcc,omitempty"`
	Subject string     `protobuf:"bytes,5,opt,name=subject,proto3" json:"subject,omitempty"`
	Body    *EmailBody `protobuf:"bytes,6,opt,name=body,proto3" json:"body,omitempty"`
}

func (x *EmailSendRequest) Reset() {
	*x = EmailSendRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_email_v1_email_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EmailSendRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EmailSendRequest) ProtoMessage() {}

func (x *EmailSendRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_email_v1_email_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EmailSendRequest.ProtoReflect.Descriptor instead.
func (*EmailSendRequest) Descriptor() ([]byte, []int) {
	return file_proto_email_v1_email_proto_rawDescGZIP(), []int{1}
}

func (x *EmailSendRequest) GetFrom() string {
	if x != nil {
		return x.From
	}
	return ""
}

func (x *EmailSendRequest) GetTo() []string {
	if x != nil {
		return x.To
	}
	return nil
}

func (x *EmailSendRequest) GetCc() []string {
	if x != nil {
		return x.Cc
	}
	return nil
}

func (x *EmailSendRequest) GetBcc() []string {
	if x != nil {
		return x.Bcc
	}
	return nil
}

func (x *EmailSendRequest) GetSubject() string {
	if x != nil {
		return x.Subject
	}
	return ""
}

func (x *EmailSendRequest) GetBody() *EmailBody {
	if x != nil {
		return x.Body
	}
	return nil
}

// Result of sending an email message
type EmailSendResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *EmailSendResponse) Reset() {
	*x = EmailSendResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_email_v1_email_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EmailSendResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EmailSendResponse) ProtoMessage() {}

func (x *EmailSendResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_email_v1_email_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EmailSendResponse.ProtoReflect.Descriptor instead.
func (*EmailSendResponse) Descriptor() ([]byte, []int) {
	return file_proto_email_v1_email_proto_rawDescGZIP(), []int{2}
}

var File_proto_email_v1_email_proto protoreflect.FileDescriptor

var file_proto_email_v1_email_proto_rawDesc = []byte{
	0x0a, 0x1a, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x31,
	0x2f, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0f, 0x6e, 0x69,
	0x74, 0x72, 0x69, 0x63, 0x2e, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x31, 0x1a, 0x17, 0x76,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x3c, 0x0a, 0x09, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x42,
	0x6f, 0x64, 0x79, 0x12, 0x1b, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02, 0x20, 0x01, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74,
	0x12, 0x12, 0x0a, 0x04, 0x68, 0x74, 0x6d, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x68, 0x74, 0x6d, 0x6c, 0x22, 0xbe, 0x01, 0x0a, 0x10, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x53, 0x65,
	0x6e, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1b, 0x0a, 0x04, 0x66, 0x72, 0x6f,
	0x6d, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02, 0x20, 0x01,
	0x52, 0x04, 0x66, 0x72, 0x6f, 0x6d, 0x12, 0x0e, 0x0a, 0x02, 0x74, 0x6f, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x02, 0x74, 0x6f, 0x12, 0x0e, 0x0a, 0x02, 0x63, 0x63, 0x18, 0x03, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x02, 0x63, 0x63, 0x12, 0x10, 0x0a, 0x03, 0x62, 0x63, 0x63, 0x18, 0x04, 0x20,
	0x03, 0x28, 0x09, 0x52, 0x03, 0x62, 0x63, 0x63, 0x12, 0x21, 0x0a, 0x07, 0x73, 0x75, 0x62, 0x6a,
	0x65, 0x63, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x72, 0x02,
	0x20, 0x01, 0x52, 0x07, 0x73, 0x75, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x12, 0x38, 0x0a, 0x04, 0x62,
	0x6f, 0x64, 0x79, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x6e, 0x69, 0x74, 0x72,
	0x69, 0x63, 0x2e, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x31, 0x2e, 0x45, 0x6d, 0x61, 0x69,
	0x6c, 0x42, 0x6f, 0x64, 0x79, 0x42, 0x08, 0xfa, 0x42, 0x05, 0x8a, 0x01, 0x02, 0x10, 0x01, 0x52,
	0x04, 0x62, 0x6f, 0x64, 0x79, 0x22, 0x13, 0x0a, 0x11, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x53, 0x65,
	0x6e, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x32, 0x5d, 0x0a, 0x0c, 0x45, 0x6d,
	0x61, 0x69, 0x6c, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x4d, 0x0a, 0x04, 0x53, 0x65,
	0x6e, 0x64, 0x12, 0x21, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x65, 0x6d, 0x61, 0x69,
	0x6c, 0x2e, 0x76, 0x31, 0x2e, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x53, 0x65, 0x6e, 0x64, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x22, 0x2e, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x65,
	0x6d, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x31, 0x2e, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x53, 0x65, 0x6e,
	0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x62, 0x0a, 0x18, 0x69, 0x6f, 0x2e,
	0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x65, 0x6d, 0x61,
	0x69, 0x6c, 0x2e, 0x76, 0x31, 0x42, 0x06, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x73, 0x50, 0x01, 0x5a,
	0x0c, 0x6e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2f, 0x76, 0x31, 0x3b, 0x76, 0x31, 0xaa, 0x02, 0x15,
	0x4e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x2e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x45, 0x6d, 0x61,
	0x69, 0x6c, 0x2e, 0x76, 0x31, 0xca, 0x02, 0x15, 0x4e, 0x69, 0x74, 0x72, 0x69, 0x63, 0x5c, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x5c, 0x56, 0x31, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_email_v1_email_proto_rawDescOnce sync.Once
	file_proto_email_v1_email_proto_rawDescData = file_proto_email_v1_email_proto_rawDesc
)

func file_proto_email_v1_email_proto_rawDescGZIP() []byte {
	file_proto_email_v1_email_proto_rawDescOnce.Do(func() {
		file_proto_email_v1_email_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_email_v1_email_proto_rawDescData)
	})
	return file_proto_email_v1_email_proto_rawDescData
}

var file_proto_email_v1_email_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_proto_email_v1_email_proto_goTypes = []interface{}{
	(*EmailBody)(nil),         // 0: nitric.email.v1.EmailBody
	(*EmailSendRequest)(nil),  // 1: nitric.email.v1.EmailSendRequest
	(*EmailSendResponse)(nil), // 2: nitric.email.v1.EmailSendResponse
}
var file_proto_email_v1_email_proto_depIdxs = []int32{
	0, // 0: nitric.email.v1.EmailSendRequest.body:type_name -> nitric.email.v1.EmailBody
	1, // 1: nitric.email.v1.EmailService.Send:input_type -> nitric.email.v1.EmailSendRequest
	2, // 2: nitric.email.v1.EmailService.Send:output_type -> nitric.email.v1.EmailSendResponse
	2, // [2:3] is the sub-list for method output_type
	1, // [1:2] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_email_v1_email_proto_init() }
func file_proto_email_v1_email_proto_init() {
	if File_proto_email_v1_email_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_email_v1_email_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EmailBody); i {
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
		file_proto_email_v1_email_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EmailSendRequest); i {
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
		file_proto_email_v1_email_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EmailSendResponse); i {
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
			RawDescriptor: file_proto_email_v1_email_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_email_v1_email_proto_goTypes,
		DependencyIndexes: file_proto_email_v1_email_proto_depIdxs,
		MessageInfos:      file_proto_email_v1_email_proto_msgTypes,
	}.Build()
	File_proto_email_v1_email_proto = out.File
	file_proto_email_v1_email_proto_rawDesc = nil
	file_proto_email_v1_email_proto_goTypes = nil
	file_proto_email_v1_email_proto_depIdxs = nil
}
