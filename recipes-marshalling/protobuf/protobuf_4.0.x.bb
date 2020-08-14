require protobuf.inc

DEPENDS = "zlib"
DEPENDS_prepend = "protobuf-native "

inherit cmake

EXTRA_OECMAKE_append_class-target += "-Dprotobuf_BUILD_PROTOC_BINARIES=OFF"
EXTRA_OECMAKE_append_class-nativesdk += "-Dprotobuf_BUILD_PROTOC_BINARIES=ON"


FILES_${PN}-compiler = "${bindir}"

PACKAGE_BEFORE_PN = "${PN}-compiler"
BBCLASSEXTEND = "nativesdk"