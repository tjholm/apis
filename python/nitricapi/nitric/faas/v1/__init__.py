# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: proto/faas/v1/faas.proto
# plugin: python-betterproto
import warnings
from dataclasses import dataclass
from typing import AsyncIterable, AsyncIterator, Dict, Iterable, List, Union

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


@dataclass(eq=False, repr=False)
class ClientMessage(betterproto.Message):
    """Messages the client is able to send to the server"""

    # Client message ID, used to pair requests/responses
    id: str = betterproto.string_field(1)
    # Client initialisation request A worker will not be eligible for triggers
    # until it has identified itself
    init_request: "InitRequest" = betterproto.message_field(2, group="content")
    # Client responsding with result of a trigger
    trigger_response: "TriggerResponse" = betterproto.message_field(3, group="content")


@dataclass(eq=False, repr=False)
class ServerMessage(betterproto.Message):
    """Messages the server is able to send to the client"""

    # Server message ID, used to pair requests/responses
    id: str = betterproto.string_field(1)
    # Server responding with client configuration details to an InitRequest
    init_response: "InitResponse" = betterproto.message_field(2, group="content")
    # Server requesting client to process a trigger
    trigger_request: "TriggerRequest" = betterproto.message_field(3, group="content")


@dataclass(eq=False, repr=False)
class ApiWorker(betterproto.Message):
    api: str = betterproto.string_field(1)
    path: str = betterproto.string_field(2)
    methods: List[str] = betterproto.string_field(3)


@dataclass(eq=False, repr=False)
class SubscriptionWorker(betterproto.Message):
    topic: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class ScheduleWorker(betterproto.Message):
    key: str = betterproto.string_field(1)
    rate: "ScheduleRate" = betterproto.message_field(10, group="cadence")
    cron: "ScheduleCron" = betterproto.message_field(11, group="cadence")


@dataclass(eq=False, repr=False)
class ScheduleRate(betterproto.Message):
    rate: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class ScheduleCron(betterproto.Message):
    cron: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class InitRequest(betterproto.Message):
    """
    InitRequest - Identifies a worker as ready to recieve triggers This message
    will contain information on the type of triggers that a worker is capable
    of handling
    """

    api: "ApiWorker" = betterproto.message_field(10, group="Worker")
    subscription: "SubscriptionWorker" = betterproto.message_field(11, group="Worker")
    schedule: "ScheduleWorker" = betterproto.message_field(12, group="Worker")


@dataclass(eq=False, repr=False)
class InitResponse(betterproto.Message):
    """Placeholder message"""

    pass


@dataclass(eq=False, repr=False)
class TriggerRequest(betterproto.Message):
    """The server has a trigger for the client to handle"""

    # The data in the trigger
    data: bytes = betterproto.bytes_field(1)
    # Should we supply a mime type for the data? Or rely on context?
    mime_type: str = betterproto.string_field(2)
    http: "HttpTriggerContext" = betterproto.message_field(3, group="context")
    topic: "TopicTriggerContext" = betterproto.message_field(4, group="context")


@dataclass(eq=False, repr=False)
class HeaderValue(betterproto.Message):
    value: List[str] = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class QueryValue(betterproto.Message):
    value: List[str] = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class HttpTriggerContext(betterproto.Message):
    # The request method
    method: str = betterproto.string_field(1)
    # The path of the request
    path: str = betterproto.string_field(2)
    # The old request headers (preserving for backwards compatibility) TODO:
    # Remove in 1.0
    headers_old: Dict[str, str] = betterproto.map_field(
        3, betterproto.TYPE_STRING, betterproto.TYPE_STRING
    )
    # The old query params (preserving for backwards compatibility) TODO: Remove
    # in 1.0
    query_params_old: Dict[str, str] = betterproto.map_field(
        4, betterproto.TYPE_STRING, betterproto.TYPE_STRING
    )
    # HTTP request headers
    headers: Dict[str, "HeaderValue"] = betterproto.map_field(
        5, betterproto.TYPE_STRING, betterproto.TYPE_MESSAGE
    )
    # HTTP Query params
    query_params: Dict[str, "QueryValue"] = betterproto.map_field(
        6, betterproto.TYPE_STRING, betterproto.TYPE_MESSAGE
    )
    # HTTP Path parameters
    path_params: Dict[str, str] = betterproto.map_field(
        7, betterproto.TYPE_STRING, betterproto.TYPE_STRING
    )

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.headers_old:
            warnings.warn(
                "HttpTriggerContext.headers_old is deprecated", DeprecationWarning
            )
        if self.query_params_old:
            warnings.warn(
                "HttpTriggerContext.query_params_old is deprecated", DeprecationWarning
            )


@dataclass(eq=False, repr=False)
class TopicTriggerContext(betterproto.Message):
    # The topic the message was published for
    topic: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class TriggerResponse(betterproto.Message):
    """The worker has successfully processed a trigger"""

    # The data returned in the response
    data: bytes = betterproto.bytes_field(1)
    # response to a http request
    http: "HttpResponseContext" = betterproto.message_field(10, group="context")
    # response to a topic trigger
    topic: "TopicResponseContext" = betterproto.message_field(11, group="context")


@dataclass(eq=False, repr=False)
class HttpResponseContext(betterproto.Message):
    """
    Specific HttpResponse message Note this does not have to be handled by the
    User at all but they will have the option of control If they choose...
    """

    # Old HTTP response headers (deprecated) TODO: Remove in 1.0
    headers_old: Dict[str, str] = betterproto.map_field(
        1, betterproto.TYPE_STRING, betterproto.TYPE_STRING
    )
    # The HTTP status of the request
    status: int = betterproto.int32_field(2)
    # HTTP response headers
    headers: Dict[str, "HeaderValue"] = betterproto.map_field(
        3, betterproto.TYPE_STRING, betterproto.TYPE_MESSAGE
    )

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.headers_old:
            warnings.warn(
                "HttpResponseContext.headers_old is deprecated", DeprecationWarning
            )


@dataclass(eq=False, repr=False)
class TopicResponseContext(betterproto.Message):
    """
    Specific event response message We do not accept responses for events only
    whether or not they were successfully processed
    """

    # Success status of the handled event
    success: bool = betterproto.bool_field(1)


class FaasServiceStub(betterproto.ServiceStub):
    async def trigger_stream(
        self,
        request_iterator: Union[
            AsyncIterable["ClientMessage"], Iterable["ClientMessage"]
        ],
    ) -> AsyncIterator["ServerMessage"]:

        async for response in self._stream_stream(
            "/nitric.faas.v1.FaasService/TriggerStream",
            request_iterator,
            ClientMessage,
            ServerMessage,
        ):
            yield response


class FaasServiceBase(ServiceBase):
    async def trigger_stream(
        self, request_iterator: AsyncIterator["ClientMessage"]
    ) -> AsyncIterator["ServerMessage"]:
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_trigger_stream(self, stream: grpclib.server.Stream) -> None:
        request_kwargs = {"request_iterator": stream.__aiter__()}

        await self._call_rpc_handler_server_stream(
            self.trigger_stream,
            stream,
            request_kwargs,
        )

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/nitric.faas.v1.FaasService/TriggerStream": grpclib.const.Handler(
                self.__rpc_trigger_stream,
                grpclib.const.Cardinality.STREAM_STREAM,
                ClientMessage,
                ServerMessage,
            ),
        }
