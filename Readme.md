- Focus on getting my app running
- Native node modules where I may need to add compilers

- Produce squashfs output from clickity-image
 - output squashfs-xz (better compression, longer to compress) - https://en.wikipedia.org/wiki/SquashFS
 - initramfs
  - include initramfs image that includes an init script - init script should run bash 
  - https://wiki.debian.org/initramfs

configure yocto to run initfs image
configure yocto to append it to the kernal

manaully get from initramfs shell to booting into partion
 - figure out command line to get from initramfs into running off sd card
