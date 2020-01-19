version = "16"
description = "Technology detection using Wappalyzer: wappalyzer.com"

zapAddOn {
    addOnName.set("Wappalyzer - Technology Detection")
    zapVersion.set("2.7.0")

    manifest {
        author.set("ZAP Dev Team")
        url.set("https://www.zaproxy.org/docs/desktop/addons/technology-detection/")
    }
}

dependencies {
    implementation("com.google.re2j:re2j:1.2")

    val batikVersion = "1.12"
    implementation("org.apache.xmlgraphics:batik-anim:$batikVersion")
    implementation("org.apache.xmlgraphics:batik-bridge:$batikVersion")
    implementation("org.apache.xmlgraphics:batik-ext:$batikVersion")
    implementation("org.apache.xmlgraphics:batik-gvt:$batikVersion")
    implementation("org.apache.xmlgraphics:batik-util:$batikVersion")

    testImplementation(project(":testutils"))
}
