package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintStream;
/* loaded from: classes.dex */
public class Node {
    Object defaultPart;
    Node next;
    Object payload;
    Type type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.subst.Node$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum Type {
        LITERAL,
        VARIABLE
    }

    public Node(Type type, Object obj) {
        this.type = type;
        this.payload = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void append(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                node2.next = node;
                return;
            }
            node2 = node3;
        }
    }

    public void dump() {
        PrintStream printStream = System.out;
        printStream.print(toString());
        printStream.print(" -> ");
        Node node = this.next;
        if (node != null) {
            node.dump();
        } else {
            printStream.print(" null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type != node.type) {
            return false;
        }
        Object obj2 = this.payload;
        if (obj2 == null ? node.payload != null : !obj2.equals(node.payload)) {
            return false;
        }
        Object obj3 = this.defaultPart;
        if (obj3 == null ? node.defaultPart != null : !obj3.equals(node.defaultPart)) {
            return false;
        }
        Node node2 = this.next;
        Node node3 = node.next;
        if (node2 == null ? node3 == null : node2.equals(node3)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Type type = this.type;
        int i4 = 0;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Object obj = this.payload;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Object obj2 = this.defaultPart;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Node node = this.next;
        if (node != null) {
            i4 = node.hashCode();
        }
        return i7 + i4;
    }

    void recursive(Node node, StringBuilder sb) {
        while (node != null) {
            sb.append(node.toString());
            sb.append(" --> ");
            node = node.next;
        }
        sb.append("null ");
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Object obj = this.defaultPart;
            if (obj != null) {
                recursive((Node) obj, sb2);
            }
            recursive((Node) this.payload, sb);
            String str = "Node{type=" + this.type + ", payload='" + sb.toString() + "'";
            if (this.defaultPart != null) {
                str = str + ", defaultPart=" + sb2.toString();
            }
            return str + CoreConstants.CURLY_RIGHT;
        }
        return "Node{type=" + this.type + ", payload='" + this.payload + "'}";
    }

    public Node(Type type, Object obj, Object obj2) {
        this.type = type;
        this.payload = obj;
        this.defaultPart = obj2;
    }
}
