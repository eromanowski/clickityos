SUMMARY = "RTAudio Image"
LICENSE = "CLOSED"

DEPENDS += "\
            pulseaudio \
            "

SRC_URI = "git://github.com/thestk/rtaudio \
           "

SRCREV = "1a8827fcd80db27c1fa8cffd880211ac5f502641"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " \
    -DCMAKE_BUILD_TYPE=Release \
"