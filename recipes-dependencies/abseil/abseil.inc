DESCRIPTION = "abseil"
HOMEPAGE = ""
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=df52c6edb7adc22e533b2bacc3bd3915"

SRC_URI = "git://github.com/abseil/abseil-cpp.git;branch=lts_2020_02_25"

SRCREV = "f1dad1e9b277066d676034d8f2a982b9e64310de"

S = "${WORKDIR}/git"

inherit cmake