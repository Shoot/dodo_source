package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;
@Deprecated
/* loaded from: classes.dex */
public class LevelAction extends Action {
    boolean inError = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        Level level;
        Object peekObject = interpretationContext.peekObject();
        if (!(peekObject instanceof Logger)) {
            this.inError = true;
            addError("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        Logger logger = (Logger) peekObject;
        String name = logger.getName();
        String subst = interpretationContext.subst(attributes.getValue("value"));
        if (!ActionConst.INHERITED.equalsIgnoreCase(subst) && !ActionConst.NULL.equalsIgnoreCase(subst)) {
            level = Level.toLevel(subst, Level.DEBUG);
        } else {
            level = null;
        }
        logger.setLevel(level);
        addInfo(name + " level set to " + logger.getLevel());
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }
}
