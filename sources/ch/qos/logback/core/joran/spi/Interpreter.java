package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
/* loaded from: classes.dex */
public class Interpreter {
    private static List<Action> EMPTY_LIST = new Vector(0);
    private final CAI_WithLocatorSupport cai;
    private ElementPath elementPath;
    private final InterpretationContext interpretationContext;
    Locator locator;
    private final RuleStore ruleStore;
    ElementPath skip = null;
    private final ArrayList<ImplicitAction> implicitActions = new ArrayList<>(3);
    Stack<List<Action>> actionListStack = new Stack<>();
    EventPlayer eventPlayer = new EventPlayer(this);

    public Interpreter(Context context, RuleStore ruleStore, ElementPath elementPath) {
        this.cai = new CAI_WithLocatorSupport(context, this);
        this.ruleStore = ruleStore;
        this.interpretationContext = new InterpretationContext(context, this);
        this.elementPath = elementPath;
    }

    private void callBodyAction(List<Action> list, String str) {
        if (list == null) {
            return;
        }
        for (Action action : list) {
            try {
                action.body(this.interpretationContext, str);
            } catch (ActionException e) {
                CAI_WithLocatorSupport cAI_WithLocatorSupport = this.cai;
                cAI_WithLocatorSupport.addError("Exception in end() methd for action [" + action + "]", e);
            }
        }
    }

    private void callEndAction(List<Action> list, String str) {
        CAI_WithLocatorSupport cAI_WithLocatorSupport;
        StringBuilder sb;
        String str2;
        if (list == null) {
            return;
        }
        for (Action action : list) {
            try {
                action.end(this.interpretationContext, str);
            } catch (ActionException e) {
                e = e;
                cAI_WithLocatorSupport = this.cai;
                sb = new StringBuilder();
                str2 = "ActionException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                cAI_WithLocatorSupport.addError(sb.toString(), e);
            } catch (RuntimeException e2) {
                e = e2;
                cAI_WithLocatorSupport = this.cai;
                sb = new StringBuilder();
                str2 = "RuntimeException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                cAI_WithLocatorSupport.addError(sb.toString(), e);
            }
        }
    }

    private void pushEmptyActionList() {
        this.actionListStack.add(EMPTY_LIST);
    }

    public void addImplicitAction(ImplicitAction implicitAction) {
        this.implicitActions.add(implicitAction);
    }

    void callBeginAction(List<Action> list, String str, Attributes attributes) {
        CAI_WithLocatorSupport cAI_WithLocatorSupport;
        StringBuilder sb;
        String str2;
        if (list == null) {
            return;
        }
        for (Action action : list) {
            try {
                action.begin(this.interpretationContext, str, attributes);
            } catch (ActionException e) {
                e = e;
                this.skip = this.elementPath.duplicate();
                cAI_WithLocatorSupport = this.cai;
                sb = new StringBuilder();
                str2 = "ActionException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                cAI_WithLocatorSupport.addError(sb.toString(), e);
            } catch (RuntimeException e2) {
                e = e2;
                this.skip = this.elementPath.duplicate();
                cAI_WithLocatorSupport = this.cai;
                sb = new StringBuilder();
                str2 = "RuntimeException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                cAI_WithLocatorSupport.addError(sb.toString(), e);
            }
        }
    }

    public void characters(BodyEvent bodyEvent) {
        setDocumentLocator(bodyEvent.locator);
        String text = bodyEvent.getText();
        List<Action> peek = this.actionListStack.peek();
        if (text != null) {
            String trim = text.trim();
            if (trim.length() > 0) {
                callBodyAction(peek, trim);
            }
        }
    }

    public void endElement(EndEvent endEvent) {
        setDocumentLocator(endEvent.locator);
        endElement(endEvent.namespaceURI, endEvent.localName, endEvent.qName);
    }

    List<Action> getApplicableActionList(ElementPath elementPath, Attributes attributes) {
        List<Action> matchActions = this.ruleStore.matchActions(elementPath);
        if (matchActions == null) {
            return lookupImplicitAction(elementPath, attributes, this.interpretationContext);
        }
        return matchActions;
    }

    public EventPlayer getEventPlayer() {
        return this.eventPlayer;
    }

    public InterpretationContext getExecutionContext() {
        return getInterpretationContext();
    }

    public InterpretationContext getInterpretationContext() {
        return this.interpretationContext;
    }

    public Locator getLocator() {
        return this.locator;
    }

    public RuleStore getRuleStore() {
        return this.ruleStore;
    }

    String getTagName(String str, String str2) {
        if (str == null || str.length() < 1) {
            return str2;
        }
        return str;
    }

    List<Action> lookupImplicitAction(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        int size = this.implicitActions.size();
        for (int i = 0; i < size; i++) {
            ImplicitAction implicitAction = this.implicitActions.get(i);
            if (implicitAction.isApplicable(elementPath, attributes, interpretationContext)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(implicitAction);
                return arrayList;
            }
        }
        return null;
    }

    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public void setInterpretationContextPropertiesMap(Map<String, String> map) {
        this.interpretationContext.setPropertiesMap(map);
    }

    public void startElement(StartEvent startEvent) {
        setDocumentLocator(startEvent.getLocator());
        startElement(startEvent.namespaceURI, startEvent.localName, startEvent.qName, startEvent.attributes);
    }

    private void endElement(String str, String str2, String str3) {
        List<Action> pop = this.actionListStack.pop();
        ElementPath elementPath = this.skip;
        if (elementPath != null) {
            if (elementPath.equals(this.elementPath)) {
                this.skip = null;
            }
        } else if (pop != EMPTY_LIST) {
            callEndAction(pop, getTagName(str2, str3));
        }
        this.elementPath.pop();
    }

    private void startElement(String str, String str2, String str3, Attributes attributes) {
        String tagName = getTagName(str2, str3);
        this.elementPath.push(tagName);
        if (this.skip != null) {
            pushEmptyActionList();
            return;
        }
        List<Action> applicableActionList = getApplicableActionList(this.elementPath, attributes);
        if (applicableActionList != null) {
            this.actionListStack.add(applicableActionList);
            callBeginAction(applicableActionList, tagName, attributes);
            return;
        }
        pushEmptyActionList();
        this.cai.addError("no applicable action for [" + tagName + "], current ElementPath  is [" + this.elementPath + "]");
    }

    public void startDocument() {
    }
}
