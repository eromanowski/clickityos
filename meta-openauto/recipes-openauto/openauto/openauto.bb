SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

DEPENDS += "libboost-all-dev \
            libusb-1.0.0-dev \
            libssl-dev \
            cmake \
            libprotobuf-dev \
            protobuf-c-compiler \
            protobuf-compiler \
            libqt5multimedia5 \
            libqt5multimedia5-plugins \
            libqt5multimediawidgets5 \
            qtmultimedia5-dev \
            libqt5bluetooth5 \
            libqt5bluetooth5-bin \
            qtconnectivity5-dev \
            pulseaudio \
            librtaudio-dev \
            "

RDEPENDS_${PN} += "bash python3 xz"

SRC_URI = "git://github.com/iovisor/bpftrace \
           "

SRCREV = "b1200771b61fd77ed7c5b326e7960d24514dd961"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " \
    -DCMAKE_BUILD_TYPE=Release \
    -DBUILD_TESTING=OFF \
"

COMPATIBLE_HOST = "(x86_64.*|aarch64.*|powerpc64.*)-linux"
COMPATIBLE_HOST_libc-musl = "null"
