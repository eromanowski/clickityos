SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

# DEPENDS += "libboost-all-dev \
#             libusb-1.0.0-dev \
#             libssl-dev \
#             cmake \
#             libprotobuf-dev \
#             protobuf-c-compiler \
#             protobuf-compiler \
#             libqt5multimedia5 \
#             libqt5multimedia5-plugins \
#             libqt5multimediawidgets5 \
#             qtmultimedia5-dev \
#             libqt5bluetooth5 \
#             libqt5bluetooth5-bin \
#             qtconnectivity5-dev \
#             pulseaudio \
#             librtaudio-dev \
#             "

DEPENDS += "\
    aasdk \
    userland \
    qtconnectivity \
    pulseaudio \
    qtmultimedia \
    rtaudio \
"

RDEPENDS_${PN} += "\
    aasdk \
    userland \
"

SRC_URI = "git://github.com/humeman/openauto;branch=development \
           "

SRCREV = "c78d1d2a41da7748031ef6cc9ecc35ef27c11215"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " \
    -DCMAKE_BUILD_TYPE=Release \
"
EXTRA_OECMAKE_append_raspberrypi3 = " \
    -DRPI3_BUILD=TRUE \
"