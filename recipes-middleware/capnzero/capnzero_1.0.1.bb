DESCRIPTION = "Recipe for Capnzero"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05ce06bbef8981aa051669305058c16b"
DEPENDS = "cppzmq \
           capnproto \
          "

SRC_URI = "git://github.com/dliess/capnzero.git;protocol=ssh;branch=develop"
SRCREV = "13cd36b632605e539041cb688b20531f260e67e7"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += " \
    -DCPM_LOCAL_PACKAGES_ONLY=ON \
    -DCAPNZERO_BUILD_TESTS=OFF \
    "
