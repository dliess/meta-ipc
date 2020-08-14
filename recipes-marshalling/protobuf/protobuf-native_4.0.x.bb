require protobuf.inc
DEPENDS = "zlib-native"

inherit cmake native

EXTRA_OECMAKE += "-Dprotobuf_BUILD_PROTOC_BINARIES=ON"