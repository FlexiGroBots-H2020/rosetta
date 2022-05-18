/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CELLULAR_STATUS PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Report current used cellular network status
 */
public class msg_cellular_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CELLULAR_STATUS = 334;
    public static final int MAVLINK_MSG_LENGTH = 14;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CELLULAR_STATUS;


    /**
     * Cell ID. If unknown, set to: UINT32_MAX
     */
    public long cid;

    /**
     * Status bitmap
     */
    public int status;

    /**
     * Mobile country code. If unknown, set to: UINT16_MAX
     */
    public int mcc;

    /**
     * Mobile network code. If unknown, set to: UINT16_MAX
     */
    public int mnc;

    /**
     * Location area code. If unknown, set to: 0
     */
    public int lac;

    /**
     * Cellular network radio type: gsm, cdma, lte...
     */
    public short type;

    /**
     * Cellular network RSSI/RSRP in dBm, absolute value
     */
    public short quality;


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_CELLULAR_STATUS;

        packet.payload.putUnsignedInt(cid);

        packet.payload.putUnsignedShort(status);

        packet.payload.putUnsignedShort(mcc);

        packet.payload.putUnsignedShort(mnc);

        packet.payload.putUnsignedShort(lac);

        packet.payload.putUnsignedByte(type);

        packet.payload.putUnsignedByte(quality);

        return packet;
    }

    /**
     * Decode a cellular_status message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.cid = payload.getUnsignedInt();

        this.status = payload.getUnsignedShort();

        this.mcc = payload.getUnsignedShort();

        this.mnc = payload.getUnsignedShort();

        this.lac = payload.getUnsignedShort();

        this.type = payload.getUnsignedByte();

        this.quality = payload.getUnsignedByte();

    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_cellular_status() {
        msgid = MAVLINK_MSG_ID_CELLULAR_STATUS;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_cellular_status(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_CELLULAR_STATUS;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_CELLULAR_STATUS - sysid:" + sysid + " compid:" + compid + " cid:" + cid + " status:" + status + " mcc:" + mcc + " mnc:" + mnc + " lac:" + lac + " type:" + type + " quality:" + quality + "";
    }
}
        