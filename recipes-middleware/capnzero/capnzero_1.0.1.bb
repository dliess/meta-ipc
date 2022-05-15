DESCRIPTION = "Recipe for Capnzero"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05ce06bbef8981aa051669305058c16b"
DEPENDS = "cppzmq \
           capnproto \
          "

SRC_URI = "git://github.com/dliess/capnzero.git;protocol=ssh;branch=develop"
SRCREV = "ba9ca2d4310c06df5bacf69d339ceec6f740d0fe"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += " \
    -DCPM_LOCAL_PACKAGES_ONLY=ON \
    -DCAPNZERO_BUILD_TESTS=OFF \
    "
