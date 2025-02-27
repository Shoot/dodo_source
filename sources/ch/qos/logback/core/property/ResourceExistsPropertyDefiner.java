package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
/* loaded from: classes.dex */
public class ResourceExistsPropertyDefiner extends PropertyDefinerBase {
    String resourceStr;

    @Override // ch.qos.logback.core.spi.PropertyDefiner
    public String getPropertyValue() {
        boolean z;
        if (OptionHelper.isEmpty(this.resourceStr)) {
            addError("The \"resource\" property must be set.");
            return null;
        }
        if (Loader.getResourceBySelfClassLoader(this.resourceStr) != null) {
            z = true;
        } else {
            z = false;
        }
        return PropertyDefinerBase.booleanAsStr(z);
    }

    public String getResource() {
        return this.resourceStr;
    }

    public void setResource(String str) {
        this.resourceStr = str;
    }
}
