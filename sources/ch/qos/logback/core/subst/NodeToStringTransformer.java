package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Iterator;
import java.util.Stack;
/* loaded from: classes.dex */
public class NodeToStringTransformer {
    final Node node;
    final PropertyContainer propertyContainer0;
    final PropertyContainer propertyContainer1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.subst.NodeToStringTransformer$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Node.Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Node.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    private void compileNode(Node node, StringBuilder sb, Stack<Node> stack) throws ScanException {
        while (node != null) {
            int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[node.type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    handleVariable(node, sb, stack);
                }
            } else {
                handleLiteral(node, sb);
            }
            node = node.next;
        }
    }

    private String constructRecursionErrorMessage(Stack<Node> stack) {
        StringBuilder sb = new StringBuilder("Circular variable reference detected while parsing input [");
        Iterator<Node> it = stack.iterator();
        while (it.hasNext()) {
            Node next = it.next();
            sb.append("${");
            sb.append(variableNodeValue(next));
            sb.append("}");
            if (stack.lastElement() != next) {
                sb.append(" --> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private boolean equalNodes(Node node, Node node2) {
        Node.Type type = node.type;
        if (type != null && !type.equals(node2.type)) {
            return false;
        }
        Object obj = node.payload;
        if (obj != null && !obj.equals(node2.payload)) {
            return false;
        }
        Object obj2 = node.defaultPart;
        if (obj2 != null && !obj2.equals(node2.defaultPart)) {
            return false;
        }
        return true;
    }

    private void handleLiteral(Node node, StringBuilder sb) {
        sb.append((String) node.payload);
    }

    private void handleVariable(Node node, StringBuilder sb, Stack<Node> stack) throws ScanException {
        boolean haveVisitedNodeAlready = haveVisitedNodeAlready(node, stack);
        stack.push(node);
        if (!haveVisitedNodeAlready) {
            StringBuilder sb2 = new StringBuilder();
            compileNode((Node) node.payload, sb2, stack);
            String sb3 = sb2.toString();
            String lookupKey = lookupKey(sb3);
            if (lookupKey != null) {
                compileNode(tokenizeAndParseString(lookupKey), sb, stack);
                stack.pop();
                return;
            }
            Object obj = node.defaultPart;
            if (obj == null) {
                sb.append(sb3 + CoreConstants.UNDEFINED_PROPERTY_SUFFIX);
                stack.pop();
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            compileNode((Node) obj, sb4, stack);
            stack.pop();
            sb.append(sb4.toString());
            return;
        }
        throw new IllegalArgumentException(constructRecursionErrorMessage(stack));
    }

    private boolean haveVisitedNodeAlready(Node node, Stack<Node> stack) {
        Iterator<Node> it = stack.iterator();
        while (it.hasNext()) {
            if (equalNodes(node, it.next())) {
                return true;
            }
        }
        return false;
    }

    private String lookupKey(String str) {
        String property;
        String property2 = this.propertyContainer0.getProperty(str);
        if (property2 != null) {
            return property2;
        }
        PropertyContainer propertyContainer = this.propertyContainer1;
        if (propertyContainer != null && (property = propertyContainer.getProperty(str)) != null) {
            return property;
        }
        String systemProperty = OptionHelper.getSystemProperty(str, null);
        if (systemProperty != null) {
            return systemProperty;
        }
        String env = OptionHelper.getEnv(str);
        if (env == null) {
            return null;
        }
        return env;
    }

    public static String substituteVariable(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) throws ScanException {
        return new NodeToStringTransformer(tokenizeAndParseString(str), propertyContainer, propertyContainer2).transform();
    }

    private static Node tokenizeAndParseString(String str) throws ScanException {
        return new Parser(new Tokenizer(str).tokenize()).parse();
    }

    private String variableNodeValue(Node node) {
        return (String) ((Node) node.payload).payload;
    }

    public String transform() throws ScanException {
        StringBuilder sb = new StringBuilder();
        compileNode(this.node, sb, new Stack<>());
        return sb.toString();
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        this.node = node;
        this.propertyContainer0 = propertyContainer;
        this.propertyContainer1 = propertyContainer2;
    }
}
