SUMMARY = "A very basic X11 image with a terminal"

IMAGE_FEATURES += "splash package-management x11-base"

LICENSE = "MIT"

inherit core-image features_check

REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_INSTALL:append = " \
    packagegroup-core-full-cmdline \
    packagegroup-core-ssh-openssh \
    packagegroup-core-x11 \
    glibc-binaries \
    glibc-gconv \
    localedef \
    xkbcomp \
    lxdm \
    lxde-common \
    lxde-icon-theme \
    lxmenu-data \
    lxpanel \
    lxsession \
    lxterminal \
    lxappearance \
    iso-codes \
    openbox \
    xserver-xorg-extension-glx \
    xf86-video-modesetting \
    xserver-xorg-module-exa \
    xserver-xorg-module-libwfb \
    xserver-xorg-utils \
    kernel-modules \
    linux-firmware \
    librsvg-gtk \
    libegl-mesa \
    libgles1-mesa \
    libgles2-mesa \
    libgl-mesa \
    mesa-vulkan-drivers \
    mesa-megadriver \
    mesa-demos \
    htop \
    git cmake meson ninja \
    vim gedit \
"
inherit rockchip-image

IMAGE_INSTALL:append = " glmark2"
PACKAGECONFIG:pn-glmark2 = " \ 
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gles2', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', '', d)} \
    drm-gles2 \
"
