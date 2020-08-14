require grpc.inc

inherit native

EXTRA_OECMAKE += "-DgRPC_BUILD_CODEGEN=ON"

DEPENDS += "abseil-native cares-native protobuf-native re2-native" 

#protobuf zlib cares re2 openssl"