SUMMARY = "AASDK Image"
LICENSE = "CLOSED"

DEPENDS += "\
            protobuf \
            protobuf-native \
            protobuf-c-native \
            boost \
            libusb1 \
            openssl \
            "

SRC_URI = "git://github.com/icecube45/aasdk \
            file://aasdk.patch \
           "

SRCREV = "b69278a0908123ffaa30981b0062623fa7bfc05d"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " \
    -DCMAKE_BUILD_TYPE=Release \
"