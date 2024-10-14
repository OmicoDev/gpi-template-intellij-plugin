plugins {
    id("me.omico.consensus.root")
    id("gpi-ij.gradm")
    id("gpi-ij.root.git")
    id("gpi-ij.root.spotless")
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = versions.gradle
    distributionType = Wrapper.DistributionType.BIN
}
