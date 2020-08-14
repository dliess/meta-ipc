DESCRIPTION = "A regular expression library"
HOMEPAGE = ""
LICENSE = ""
### According to grpc submodule, this should be cares-1_12_0
### but that does not exist
SRC_URI = "git://github.com/google/re2.git;branch=master"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b5c31eb512bdf3cb11ffd5713963760"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake