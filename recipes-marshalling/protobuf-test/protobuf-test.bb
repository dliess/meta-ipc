DESCRIPTION = "This is the protobuf-test"
HOMEPAGE = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/dliess/ProtobufTest.git;branch=master"
SRCREV = "${AUTOREV}"


DEPENDS += "protobuf protobuf-native"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DUSE_PROTOBUF_GENERATE=ON"