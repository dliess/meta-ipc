DESCRIPTION = "Recipe for Capnzero"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05ce06bbef8981aa051669305058c16b"
DEPENDS = "cppzmq \
           capnproto \
          "

SRC_URI = "git://github.com/dliess/capnzero.git;protocol=ssh;branch=develop"
SRCREV = "59e93789b064c102e897d5adb3fb8a88e35d1892"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += " \
    -DCPM_LOCAL_PACKAGES_ONLY=ON \
    -DCAPNZERO_BUILD_TESTS=OFF \
    "
