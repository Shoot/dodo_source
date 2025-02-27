package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class ParamAction extends Action {
    static String NO_NAME = "No name attribute in <param> element";
    static String NO_VALUE = "No value attribute in <param> element";
    boolean inError = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String value = attributes.getValue(Action.NAME_ATTRIBUTE);
        String value2 = attributes.getValue("value");
        if (value == null) {
            this.inError = true;
            addError(NO_NAME);
        } else if (value2 == null) {
            this.inError = true;
            addError(NO_VALUE);
        } else {
            String trim = value2.trim();
            PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
            propertySetter.setContext(this.context);
            propertySetter.setProperty(interpretationContext.subst(value), interpretationContext.subst(trim));
        }
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }
}
