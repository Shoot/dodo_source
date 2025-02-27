package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Properties;
/* loaded from: classes.dex */
public class ActionUtil {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.joran.action.ActionUtil$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope;

        static {
            int[] iArr = new int[Scope.values().length];
            $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope = iArr;
            try {
                iArr[Scope.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum Scope {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    public static void setProperties(InterpretationContext interpretationContext, Properties properties, Scope scope) {
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[scope.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    OptionHelper.setSystemProperties(interpretationContext, properties);
                    return;
                }
                return;
            }
            new ContextUtil(interpretationContext.getContext()).addProperties(properties);
            return;
        }
        interpretationContext.addSubstitutionProperties(properties);
    }

    public static void setProperty(InterpretationContext interpretationContext, String str, String str2, Scope scope) {
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[scope.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    OptionHelper.setSystemProperty(interpretationContext, str, str2);
                    return;
                }
                return;
            }
            interpretationContext.getContext().putProperty(str, str2);
            return;
        }
        interpretationContext.addSubstitutionProperty(str, str2);
    }

    public static Scope stringToScope(String str) {
        Scope scope = Scope.SYSTEM;
        if (scope.toString().equalsIgnoreCase(str)) {
            return scope;
        }
        Scope scope2 = Scope.CONTEXT;
        if (scope2.toString().equalsIgnoreCase(str)) {
            return scope2;
        }
        return Scope.LOCAL;
    }
}
