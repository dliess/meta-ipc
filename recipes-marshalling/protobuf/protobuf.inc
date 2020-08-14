SUMMARY = "Google protocol buffers"
DESCRIPTION = "Protocol buffers are a language-neutral, platform-neutral extensible mechanism for serializing structured data."
HOMEPAGE = "https://developers.google.com/protocol-buffers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

SRC_URI = "git://github.com/google/protobuf.git;branch=${PV} \
          file://0001-yocto-compatible.patch"
SRCREV = "6c61c1e63b9be3c36db6bed19032dfc0d63aadda"

S = "${WORKDIR}/git"
OECMAKE_SOURCEPATH = "${S}/cmake"

EXTRA_OECMAKE += "-Dprotobuf_BUILD_TESTS=OFF"
EXTRA_OECMAKE += "-Dprotobuf_BUILD_CONFORMANCE=OFF"
EXTRA_OECMAKE += "-Dprotobuf_BUILD_EXAMPLES=OFF"