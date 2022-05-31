DESCRIPTION = "Recipe for Capnzero"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05ce06bbef8981aa051669305058c16b"
DEPENDS = "cppzmq \
           capnproto \
          "

SRC_URI = "git://github.com/dliess/capnzero.git;protocol=ssh;branch=develop"
SRCREV = "08ee8c69761ff2913708815a74fd87f09f615c3d"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += " \
    -DCPM_LOCAL_PACKAGES_ONLY=ON \
    -DCAPNZERO_BUILD_TESTS=OFF \
    "
