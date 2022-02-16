DESCRIPTION = "cares"
HOMEPAGE = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

### According to grpc submodule, this should be cares-1_12_0
### but that does not exist
SRC_URI = "git://github.com/c-ares/c-ares.git;branch=master"

SRCREV = "320b99bb9c63b07421c8dc10561c5796003ed478"

S = "${WORKDIR}/git"

inherit cmake
