/**
 * Simple Virtual Resetting Switch Driver that works on
 * Amazon Alexa to force on/off then reset.
 *
 *
 * Version:  1.0
 *
 */
metadata {
    definition(name: "Virtual Resetting Switch", namespace: "waytotheweb", author: "Jonathan Michaelson", importUrl: "https://raw.githubusercontent.com/waytotheweb/hubitat/main/drivers/Virtual%20Resetting%20Switch.groovy") {
        capability "Switch"

	command "reset"
    }
}

def on() {
    log.info "on()"
    sendEvent(name: "switch", value: "on")
    runIn(2, "reset")
}

def off() {
    log.info "off()"
    sendEvent(name: "switch", value: "off")
    runIn(2, "reset")
}

def reset() {
    log.info "reset()"
    sendEvent(name: "switch", value: "reset")
}
