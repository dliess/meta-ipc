DESCRIPTION = "gRPC"
HOMEPAGE = "https://grpc.io/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/grpc/grpc.git;branch=master"

### v1.31.1
#SRCREV = "7d7e4567625db7cfebf8969a225948097a3f9f89"
SRCREV = "${AUTOREV}"

EXTRA_OECMAKE += "-DgRPC_GFLAGS_PROVIDER=package"
EXTRA_OECMAKE += "-DgRPC_CARES_PROVIDER=package"
EXTRA_OECMAKE += "-DgRPC_PROTOBUF_PROVIDER=package"
EXTRA_OECMAKE += "-DgRPC_ABSL_PROVIDER=package"
EXTRA_OECMAKE += "-DgRPC_ZLIB_PROVIDER=package"
EXTRA_OECMAKE += "-DgRPC_RE2_PROVIDER=package"
EXTRA_OECMAKE += "-DgRPC_SSL_PROVIDER=package"

EXTRA_OECMAKE += "-DgRPC_BUILD_TESTS=OFF"
EXTRA_OECMAKE += "-DgRPC_BUILD_CSHARP_EXT=OFF"

EXTRA_OECMAKE += "-DgRPC_BUILD_GRPC_CPP_PLUGIN=ON \
                  -DgRPC_BUILD_GRPC_CSHARP_PLUGIN=OFF \
                  -DgRPC_BUILD_GRPC_NODE_PLUGIN=OFF \
                  -DgRPC_BUILD_GRPC_OBJECTIVE_C_PLUGIN=OFF \
                  -DgRPC_BUILD_GRPC_PHP_PLUGIN=OFF \
                  -DgRPC_BUILD_GRPC_PYTHON_PLUGIN=ON \
                  -DgRPC_BUILD_GRPC_RUBY_PLUGIN=OFF"

S = "${WORKDIR}/git"

inherit cmake

#do_install () {
#    install -d ${D}/usr/include
#    install -m 0755 ${S}/zmq.hpp ${D}/usr/include/
#}

#PACKAGES = "${PN}-dev"

#RDEPENDS_${PN}-dev = "zeromq-dev"