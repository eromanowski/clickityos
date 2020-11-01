SUMMARY = "Clickity Image"
LICENSE = "CLOSED"

inherit core-image extrausers

#  splash 
#   ssh-server-dropbear 

IMAGE_FEATURES_append = " \
    x11-base \
"

#     nodejs 

CORE_IMAGE_EXTRA_INSTALL_append = "\
    nodejs nodejs-npm \
    chromium-x11 \
    sudo \
    nano \
    clack-init \
"
EXTRA_USERS_PARAMS = "useradd -p '' app;"