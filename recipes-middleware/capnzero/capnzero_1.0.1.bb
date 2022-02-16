DESCRIPTION = "Recipe for Capnzero"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05ce06bbef8981aa051669305058c16b"
DEPENDS = "cppzmq \
           capnproto \
          "

SRC_URI = "git://github.com/dliess/capnzero.git;protocol=ssh;branch=develop"
SRCREV = "ca4634be30100fe4d9b20d62105cf8df0cdfab09"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += " \
    -DCPM_LOCAL_PACKAGES_ONLY=ON \
    -DCAPNZERO_BUILD_TESTS=OFF \
    "
