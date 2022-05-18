/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DISTANCE_SENSOR PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Distance sensor information for an onboard rangefinder.
 */
public class msg_distance_sensor extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DISTANCE_SENSOR = 132;
    public static final int MAVLINK_MSG_LENGTH = 38;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DISTANCE_SENSOR;


    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;

    /**
     * Minimum distance the sensor can measure
     */
    public int min_distance;

    /**
     * Maximum distance the sensor can measure
     */
    public int max_distance;

    /**
     * Current distance reading
     */
    public int current_distance;

    /**
     * Type of distance sensor.
     */
    public short type;

    /**
     * Onboard ID of the sensor
     */
    public short id;

    /**
     * Direction the sensor faces. downward-facing: ROTATION_PITCH_270, upward-facing: ROTATION_PITCH_90, backward-facing: ROTATION_PITCH_180, forward-facing: ROTATION_NONE, left-facing: ROTATION_YAW_90, right-facing: ROTATION_YAW_270
     */
    public short orientation;

    /**
     * Measurement variance. Max standard deviation is 6cm. 255 if unknown.
     */
    public short covariance;

    /**
     * Horizontal Field of View (angle) where the distance measurement is valid and the field of view is known. Otherwise this is set to 0.
     */
    public float horizontal_fov;

    /**
     * Vertical Field of View (angle) where the distance measurement is valid and the field of view is known. Otherwise this is set to 0.
     */
    public float vertical_fov;

    /**
     * Quaternion of the sensor orientation in vehicle body frame (w, x, y, z order, zero-rotation is 1, 0, 0, 0). Zero-rotation is along the vehicle body x-axis. This field is required if the orientation is set to MAV_SENSOR_ROTATION_CUSTOM. Set it to 0 if invalid."
     */
    public float quaternion[] = new float[4];


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;

        packet.payload.putUnsignedInt(time_boot_ms);

        packet.payload.putUnsignedShort(min_distance);

        packet.payload.putUnsignedShort(max_distance);

        packet.payload.putUnsignedShort(current_distance);

        packet.payload.putUnsignedByte(type);

        packet.payload.putUnsignedByte(id);

        packet.payload.putUnsignedByte(orientation);

        packet.payload.putUnsignedByte(covariance);

        packet.payload.putFloat(horizontal_fov);

        packet.payload.putFloat(vertical_fov);


        for (int i = 0; i < quaternion.length; i++) {
            packet.payload.putFloat(quaternion[i]);
        }


        return packet;
    }

    /**
     * Decode a distance_sensor message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();

        this.min_distance = payload.getUnsignedShort();

        this.max_distance = payload.getUnsignedShort();

        this.current_distance = payload.getUnsignedShort();

        this.type = payload.getUnsignedByte();

        this.id = payload.getUnsignedByte();

        this.orientation = payload.getUnsignedByte();

        this.covariance = payload.getUnsignedByte();

        this.horizontal_fov = payload.getFloat();

        this.vertical_fov = payload.getFloat();


        for (int i = 0; i < this.quaternion.length; i++) {
            this.quaternion[i] = payload.getFloat();
        }


    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_distance_sensor() {
        msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_distance_sensor(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_DISTANCE_SENSOR - sysid:" + sysid + " compid:" + compid + " time_boot_ms:" + time_boot_ms + " min_distance:" + min_distance + " max_distance:" + max_distance + " current_distance:" + current_distance + " type:" + type + " id:" + id + " orientation:" + orientation + " covariance:" + covariance + " horizontal_fov:" + horizontal_fov + " vertical_fov:" + vertical_fov + " quaternion:" + quaternion + "";
    }
}
        