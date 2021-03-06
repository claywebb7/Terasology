package org.terasology.data.blocks.definitions.liquid

/**
 * Don't fall in the lava! Well, at least not after it starts hurting
 * As a liquid this block likely gets some added stats here, like viscosity
 * Lava blocks may also differ in height? If they're stored in a flowing state
 * That might be an example of a meta-block - need more info than the byte ID
 */
block {
    version = 1
    shape = "TrimmedLoweredCube"
    loweredShape = "LoweredCube"
    // Let the lava shine!
    luminance = 15
    hardness = 0
}