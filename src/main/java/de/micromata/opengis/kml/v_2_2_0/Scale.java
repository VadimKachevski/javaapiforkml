
package de.micromata.opengis.kml.v_2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;


/**
 * <scale>
 * <p>
 * Resizes the icon. 
 * </p>
 * <p>
 * Note: The <geomScale> tag has been deprecated. Use <scale> instead. 
 * </p>
 * <p>
 * Scales a model along the x, y, and z axes in the model's coordinate space. <Scale> 
 * <x>2.5</x> <y>2.5</y> <z>3.5</z> </Scale> 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleType", propOrder = {
    "x",
    "y",
    "z",
    "scaleSimpleExtension",
    "scaleObjectExtension"
})
@XmlRootElement(name = "Scale", namespace = "http://www.opengis.net/kml/2.2")
public class Scale
    extends AbstractObject
{

    /**
     * <x>, <y>, <w>, <h>
     * <p>
     * Use of these elements within <Icon> has been deprecated. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1.0")
    protected double x = 1.0D;
    @XmlElement(defaultValue = "1.0")
    protected double y = 1.0D;
    @XmlElement(defaultValue = "1.0")
    protected double z = 1.0D;
    @XmlElement(name = "ScaleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> scaleSimpleExtension;
    /**
     * <Object>
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the <Update> mechanism is to 
     * be used. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;<strong>
     * &lt;!-- <em>Object</em> id="ID" targetId="NCName" --&gt;
     * &lt;!-- /<em>Object</em>&gt; --&gt;</strong></pre>
     * 
     * 
     * 
     */
    @XmlElement(name = "ScaleObjectExtensionGroup")
    protected List<AbstractObject> scaleObjectExtension;

    public Scale() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getX() {
        return x;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getY() {
        return y;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setY(double value) {
        this.y = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getZ() {
        return z;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setZ(double value) {
        this.z = value;
    }

    /**
     * 
     */
    public List<Object> getScaleSimpleExtension() {
        if (scaleSimpleExtension == null) {
            scaleSimpleExtension = new ArrayList<Object>();
        }
        return this.scaleSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getScaleObjectExtension() {
        if (scaleObjectExtension == null) {
            scaleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.scaleObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(x);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(y);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(z);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        result = ((prime*result)+((scaleSimpleExtension == null)? 0 :scaleSimpleExtension.hashCode()));
        result = ((prime*result)+((scaleObjectExtension == null)? 0 :scaleObjectExtension.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (super.equals(obj) == false) {
            return false;
        }
        if ((obj instanceof Scale) == false) {
            return false;
        }
        Scale other = ((Scale) obj);
        if (x!= other.x) {
            return false;
        }
        if (y!= other.y) {
            return false;
        }
        if (z!= other.z) {
            return false;
        }
        if (scaleSimpleExtension == null) {
            if (other.scaleSimpleExtension!= null) {
                return false;
            }
        } else {
            if (scaleSimpleExtension.equals(other.scaleSimpleExtension) == false) {
                return false;
            }
        }
        if (scaleObjectExtension == null) {
            if (other.scaleObjectExtension!= null) {
                return false;
            }
        } else {
            if (scaleObjectExtension.equals(other.scaleObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the value of the scaleSimpleExtension property Objects of the following type(s) are allowed in the list List<Object>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withScaleSimpleExtension} instead.
     * 
     * 
     * @param scaleSimpleExtension
     */
    public void setScaleSimpleExtension(final List<Object> scaleSimpleExtension) {
        this.scaleSimpleExtension = scaleSimpleExtension;
    }

    /**
     * add a value to the scaleSimpleExtension property collection
     * 
     * @param scaleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Scale addToScaleSimpleExtension(final Object scaleSimpleExtension) {
        this.getScaleSimpleExtension().add(scaleSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the scaleObjectExtension property Objects of the following type(s) are allowed in the list List<AbstractObject>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withScaleObjectExtension} instead.
     * 
     * 
     * @param scaleObjectExtension
     */
    public void setScaleObjectExtension(final List<AbstractObject> scaleObjectExtension) {
        this.scaleObjectExtension = scaleObjectExtension;
    }

    /**
     * add a value to the scaleObjectExtension property collection
     * 
     * @param scaleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Scale addToScaleObjectExtension(final AbstractObject scaleObjectExtension) {
        this.getScaleObjectExtension().add(scaleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Scale addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param x
     *     required parameter
     */
    public Scale withX(final double x) {
        this.setX(x);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param y
     *     required parameter
     */
    public Scale withY(final double y) {
        this.setY(y);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param z
     *     required parameter
     */
    public Scale withZ(final double z) {
        this.setZ(z);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param scaleSimpleExtension
     *     required parameter
     */
    public Scale withScaleSimpleExtension(final List<Object> scaleSimpleExtension) {
        this.setScaleSimpleExtension(scaleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param scaleObjectExtension
     *     required parameter
     */
    public Scale withScaleObjectExtension(final List<AbstractObject> scaleObjectExtension) {
        this.setScaleObjectExtension(scaleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Scale withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Scale withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Scale withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

}
