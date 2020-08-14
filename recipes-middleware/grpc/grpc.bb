require grpc.inc

DEPENDS_prepend = "grpc-native "

EXTRA_OECMAKE_append_class-target += "-DgRPC_BUILD_CODEGEN=OFF"
EXTRA_OECMAKE_append_class-nativesdk += "-DgRPC_BUILD_CODEGEN=ON"

DEPENDS += "abseil protobuf zlib cares re2 openssl"