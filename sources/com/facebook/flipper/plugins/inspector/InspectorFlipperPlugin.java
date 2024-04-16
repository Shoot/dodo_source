package com.facebook.flipper.plugins.inspector;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import com.facebook.flipper.plugins.common.MainThreadFlipperReceiver;
import com.facebook.flipper.plugins.inspector.ApplicationWrapper;
import com.facebook.flipper.plugins.inspector.descriptors.ApplicationDescriptor;
import com.huawei.hms.actions.SearchIntents;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class InspectorFlipperPlugin implements FlipperPlugin {
    private static final String TAG = "ContextDescriptor";
    private ApplicationWrapper mApplication;
    private FlipperConnection mConnection;
    private DescriptorMapping mDescriptorMapping;
    private List<ExtensionCommand> mExtensionCommands;
    final FlipperReceiver mGetAXNodes;
    final FlipperReceiver mGetAXRoot;
    final FlipperReceiver mGetAllNodes;
    final FlipperReceiver mGetNodes;
    final FlipperReceiver mGetRoot;
    final FlipperReceiver mGetSearchResults;
    final FlipperReceiver mGetSnapshot;
    private boolean mHighlightedAlignmentMode;
    private String mHighlightedId;
    final FlipperReceiver mIsSearchActive;
    private ObjectTracker mObjectTracker;
    final FlipperReceiver mOnRequestAXFocus;
    final FlipperReceiver mSetData;
    final FlipperReceiver mSetHighlighted;
    final FlipperReceiver mSetResolvedPath;
    final FlipperReceiver mSetSearchActive;
    final FlipperReceiver mShouldShowLithoAccessibilitySettings;
    private boolean mShowLithoAccessibilitySettings;
    TouchOverlayView mTouchOverlay;
    private Map<String, String> resolvedPaths;

    /* loaded from: classes2.dex */
    public interface ExtensionCommand {
        String command();

        FlipperReceiver receiver(ObjectTracker objectTracker, FlipperConnection flipperConnection);
    }

    /* loaded from: classes2.dex */
    public enum IDE {
        DIFFUSION("Diffusion"),
        AS("Android Studio"),
        VSCODE("Visual Studio Code");
        
        private String ideName;

        IDE(String str) {
            this.ideName = str;
        }

        public static IDE fromString(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return AS;
            }
        }

        public String getFullIdeName() {
            return this.ideName;
        }
    }

    public InspectorFlipperPlugin(Context context, DescriptorMapping descriptorMapping) {
        this(new ApplicationWrapper(getAppContextFromContext(context)), descriptorMapping, (List<ExtensionCommand>) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object assertNotNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new RuntimeException("Unexpected null value");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlipperObject getAXNode(String str) throws Exception {
        final NodeDescriptor<Object> descriptorForObject;
        final Object obj = this.mObjectTracker.get(str);
        if (obj == null || (descriptorForObject = descriptorForObject(obj)) == null) {
            return null;
        }
        final FlipperArray.Builder builder = new FlipperArray.Builder();
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.19
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                int aXChildCount = descriptorForObject.getAXChildCount(obj);
                for (int i = 0; i < aXChildCount; i++) {
                    builder.put(InspectorFlipperPlugin.this.trackObject(InspectorFlipperPlugin.assertNotNull(descriptorForObject.getAXChildAt(obj, i))));
                }
            }
        }.run();
        final FlipperObject.Builder builder2 = new FlipperObject.Builder();
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.20
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                for (Named<FlipperObject> named : descriptorForObject.getAXData(obj)) {
                    builder2.put(named.getName(), named.getValue());
                }
            }
        }.run();
        final FlipperArray.Builder builder3 = new FlipperArray.Builder();
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.21
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                for (Named<String> named : descriptorForObject.getAXAttributes(obj)) {
                    builder3.put(new FlipperObject.Builder().put(Action.NAME_ATTRIBUTE, named.getName()).put("value", named.getValue()).build());
                }
            }
        }.run();
        String aXName = descriptorForObject.getAXName(obj);
        return new FlipperObject.Builder().put("id", descriptorForObject.getId(obj)).put(Action.NAME_ATTRIBUTE, aXName.substring(aXName.lastIndexOf(46) + 1)).put("data", builder2).put("children", builder).put("attributes", builder3).put("decoration", descriptorForObject.getAXDecoration(obj)).put("extraInfo", descriptorForObject.getExtraInfo(obj)).build();
    }

    private static Application getAppContextFromContext(Context context) {
        return (Application) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlipperObject getNode(String str) throws Exception {
        final NodeDescriptor<Object> descriptorForObject;
        final Object obj = this.mObjectTracker.get(str);
        if (obj == null || (descriptorForObject = descriptorForObject(obj)) == null) {
            return null;
        }
        final FlipperArray.Builder builder = new FlipperArray.Builder();
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.16
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                int childCount = descriptorForObject.getChildCount(obj);
                for (int i = 0; i < childCount; i++) {
                    Object childAt = descriptorForObject.getChildAt(obj, i);
                    if (childAt == null) {
                        Log.w(InspectorFlipperPlugin.TAG, "Failed to get child at index: " + i);
                        return;
                    }
                    builder.put(InspectorFlipperPlugin.this.trackObject(childAt));
                }
            }
        }.run();
        final FlipperObject.Builder builder2 = new FlipperObject.Builder();
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.17
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                for (Named<FlipperObject> named : descriptorForObject.getData(obj)) {
                    builder2.put(named.getName(), named.getValue());
                }
            }
        }.run();
        final FlipperArray.Builder builder3 = new FlipperArray.Builder();
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.18
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                for (Named<String> named : descriptorForObject.getAttributes(obj)) {
                    builder3.put(new FlipperObject.Builder().put(Action.NAME_ATTRIBUTE, named.getName()).put("value", named.getValue()).build());
                }
            }
        }.run();
        return new FlipperObject.Builder().put("id", descriptorForObject.getId(obj)).put(Action.NAME_ATTRIBUTE, descriptorForObject.getName(obj)).put("data", builder2).put("children", builder).put("attributes", builder3).put("decoration", descriptorForObject.getDecoration(obj)).put("extraInfo", descriptorForObject.getExtraInfo(obj)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getSnapshot(String str, boolean z) throws Exception {
        Object obj;
        NodeDescriptor<Object> descriptorForObject;
        if (str == null || (obj = this.mObjectTracker.get(str)) == null || (descriptorForObject = descriptorForObject(obj)) == null) {
            return null;
        }
        try {
            return descriptorForObject.getSnapshot(obj, z);
        } catch (AbstractMethodError unused) {
            return null;
        }
    }

    private boolean hasAXNode(FlipperObject flipperObject) {
        FlipperObject object = flipperObject.getObject("extraInfo");
        if (object != null && object.getBoolean("linkedNode")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighlighted(String str, boolean z, boolean z2) throws Exception {
        NodeDescriptor<Object> descriptorForObject;
        Object obj = this.mObjectTracker.get(str);
        if (obj == null || (descriptorForObject = descriptorForObject(obj)) == null) {
            return;
        }
        descriptorForObject.setHighlighted(obj, z, z2);
    }

    NodeDescriptor<Object> descriptorForObject(Object obj) {
        return this.mDescriptorMapping.descriptorForClass(assertNotNull(obj).getClass());
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return "Inspector";
    }

    public String getResolvedPath(String str) {
        return this.resolvedPaths.get(str);
    }

    public boolean isConnectionEstablished() {
        if (this.mConnection != null) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) throws Exception {
        this.mConnection = flipperConnection;
        this.mDescriptorMapping.onConnect(flipperConnection);
        flipperConnection.receive("getRoot", this.mGetRoot);
        flipperConnection.receive("getAllNodes", this.mGetAllNodes);
        flipperConnection.receive("getNodes", this.mGetNodes);
        flipperConnection.receive("setData", this.mSetData);
        flipperConnection.receive("setHighlighted", this.mSetHighlighted);
        flipperConnection.receive("setSearchActive", this.mSetSearchActive);
        flipperConnection.receive("isSearchActive", this.mIsSearchActive);
        flipperConnection.receive("getSearchResults", this.mGetSearchResults);
        flipperConnection.receive("getAXRoot", this.mGetAXRoot);
        flipperConnection.receive("getAXNodes", this.mGetAXNodes);
        flipperConnection.receive("getSnapshot", this.mGetSnapshot);
        flipperConnection.receive("onRequestAXFocus", this.mOnRequestAXFocus);
        flipperConnection.receive("shouldShowLithoAccessibilitySettings", this.mShouldShowLithoAccessibilitySettings);
        flipperConnection.receive("setResolvedPath", this.mSetResolvedPath);
        List<ExtensionCommand> list = this.mExtensionCommands;
        if (list != null) {
            for (ExtensionCommand extensionCommand : list) {
                if (extensionCommand.command().equals("forceLithoAXRender")) {
                    this.mShowLithoAccessibilitySettings = true;
                }
                flipperConnection.receive(extensionCommand.command(), extensionCommand.receiver(this.mObjectTracker, this.mConnection));
            }
        }
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() throws Exception {
        String str = this.mHighlightedId;
        if (str != null) {
            setHighlighted(str, false, false);
            this.mHighlightedId = null;
        }
        ApplicationDescriptor.clearEditedDelegates();
        this.mObjectTracker.clear();
        this.mDescriptorMapping.onDisconnect();
        this.mConnection = null;
    }

    public void openInIDE(String str, String str2, int i, IDE ide) {
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection == null) {
            return;
        }
        flipperConnection.send("openInIDE", new FlipperObject.Builder().put("resolvedPath", str).put("repo", str2).put("lineNumber", Integer.valueOf(i)).put("ide", ide).build());
    }

    void populateAllAXNodes(String str, FlipperObject.Builder builder) throws Exception {
        FlipperObject aXNode = getAXNode(str);
        builder.put(str, aXNode);
        FlipperArray array = aXNode.getArray("children");
        int length = array.length();
        for (int i = 0; i < length; i++) {
            populateAllAXNodes(array.getString(i), builder);
        }
    }

    void populateAllNodes(String str, FlipperObject.Builder builder) throws Exception {
        FlipperObject node = getNode(str);
        builder.put(str, node);
        FlipperArray array = node.getArray("children");
        int length = array.length();
        for (int i = 0; i < length; i++) {
            populateAllNodes(array.getString(i), builder);
        }
    }

    public void resolvePath(String str, String str2, String str3) {
        if (this.mConnection != null && this.resolvedPaths.get(str2) == null) {
            this.mConnection.send("resolvePath", new FlipperObject.Builder().put("fileName", str).put("className", str2).put("dirRoot", str3).build());
        }
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return true;
    }

    public SearchResultNode searchTree(String str, Object obj, boolean z) throws Exception {
        FlipperObject flipperObject = null;
        if (obj == null) {
            return null;
        }
        NodeDescriptor<Object> descriptorForObject = descriptorForObject(obj);
        boolean matches = descriptorForObject.matches(str, obj);
        ArrayList arrayList = null;
        for (int i = 0; i < descriptorForObject.getChildCount(obj); i++) {
            SearchResultNode searchTree = searchTree(str, descriptorForObject.getChildAt(obj, i), z);
            if (searchTree != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(searchTree);
            }
        }
        if (!matches && arrayList == null) {
            return null;
        }
        String trackObject = trackObject(obj);
        FlipperObject node = getNode(trackObject);
        if (z && hasAXNode(node)) {
            flipperObject = getAXNode(trackObject);
        }
        return new SearchResultNode(trackObject, matches, node, arrayList, flipperObject);
    }

    String trackObject(Object obj) throws Exception {
        NodeDescriptor<Object> descriptorForObject = descriptorForObject(obj);
        String id = descriptorForObject.getId(obj);
        if (obj != this.mObjectTracker.get(id)) {
            this.mObjectTracker.put(id, obj);
            descriptorForObject.init(obj);
        }
        return id;
    }

    public InspectorFlipperPlugin(Context context, DescriptorMapping descriptorMapping, List<ExtensionCommand> list) {
        this(new ApplicationWrapper(getAppContextFromContext(context)), descriptorMapping, list);
    }

    InspectorFlipperPlugin(ApplicationWrapper applicationWrapper, DescriptorMapping descriptorMapping, List<ExtensionCommand> list) {
        this.resolvedPaths = new HashMap();
        this.mShouldShowLithoAccessibilitySettings = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.2
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                flipperResponder.success(new FlipperObject.Builder().put("showLithoAccessibilitySettings", Boolean.valueOf(InspectorFlipperPlugin.this.mShowLithoAccessibilitySettings)).build());
            }
        };
        this.mGetRoot = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.3
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                InspectorFlipperPlugin inspectorFlipperPlugin = InspectorFlipperPlugin.this;
                flipperResponder.success(inspectorFlipperPlugin.getNode(inspectorFlipperPlugin.trackObject(inspectorFlipperPlugin.mApplication)));
            }
        };
        this.mGetAXRoot = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.4
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                InspectorFlipperPlugin inspectorFlipperPlugin = InspectorFlipperPlugin.this;
                flipperResponder.success(inspectorFlipperPlugin.getAXNode(inspectorFlipperPlugin.trackObject(inspectorFlipperPlugin.mApplication)));
            }
        };
        this.mGetAllNodes = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.5
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                FlipperObject.Builder builder = new FlipperObject.Builder();
                FlipperObject.Builder builder2 = new FlipperObject.Builder();
                InspectorFlipperPlugin inspectorFlipperPlugin = InspectorFlipperPlugin.this;
                String trackObject = inspectorFlipperPlugin.trackObject(inspectorFlipperPlugin.mApplication);
                InspectorFlipperPlugin.this.populateAllAXNodes(trackObject, builder2);
                InspectorFlipperPlugin.this.populateAllNodes(trackObject, builder);
                flipperResponder.success(new FlipperObject.Builder().put("allNodes", new FlipperObject.Builder().put("elements", builder.build()).put("AXelements", builder2.build()).put("rootElement", trackObject).put("rootAXElement", trackObject).build()).build());
            }
        };
        this.mGetNodes = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.6
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                FlipperArray array = flipperObject.getArray("ids");
                FlipperArray.Builder builder = new FlipperArray.Builder();
                int length = array.length();
                for (int i = 0; i < length; i++) {
                    String string = array.getString(i);
                    FlipperObject node = InspectorFlipperPlugin.this.getNode(string);
                    if (node != null) {
                        builder.put(node);
                    } else {
                        flipperResponder.error(new FlipperObject.Builder().put("message", "No node with given id").put("id", string).build());
                        return;
                    }
                }
                flipperResponder.success(new FlipperObject.Builder().put("elements", builder).build());
            }
        };
        this.mGetAXNodes = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.7
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                FlipperArray array = flipperObject.getArray("ids");
                FlipperArray.Builder builder = new FlipperArray.Builder();
                boolean z = flipperObject.getBoolean("forAccessibilityEvent");
                String string = flipperObject.getString("selected");
                int length = array.length();
                for (int i = 0; i < length; i++) {
                    String string2 = array.getString(i);
                    FlipperObject aXNode = InspectorFlipperPlugin.this.getAXNode(string2);
                    if (aXNode == null) {
                        if (!z) {
                            flipperResponder.error(new FlipperObject.Builder().put("message", "No accessibility node with given id").put("id", string2).build());
                            return;
                        }
                    } else if (z) {
                        if (string2.equals(string) || aXNode.getObject("extraInfo").getBoolean("focused")) {
                            builder.put(aXNode);
                        }
                    } else {
                        builder.put(aXNode);
                    }
                }
                flipperResponder.success(new FlipperObject.Builder().put("elements", builder).build());
            }
        };
        this.mOnRequestAXFocus = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.8
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                Object obj = InspectorFlipperPlugin.this.mObjectTracker.get(flipperObject.getString("id"));
                if (obj != null && (obj instanceof View)) {
                    ((View) obj).sendAccessibilityEvent(8);
                }
            }
        };
        this.mSetData = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.9
            /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[LOOP:0: B:15:0x0052->B:16:0x0054, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceiveOnMainThread(com.facebook.flipper.core.FlipperObject r12, com.facebook.flipper.core.FlipperResponder r13) throws java.lang.Exception {
                /*
                    r11 = this;
                    java.lang.String r0 = "id"
                    java.lang.String r0 = r12.getString(r0)
                    java.lang.String r1 = "ax"
                    boolean r1 = r12.getBoolean(r1)
                    java.lang.String r2 = "path"
                    com.facebook.flipper.core.FlipperArray r2 = r12.getArray(r2)
                    java.lang.String r3 = "value"
                    java.lang.Object r4 = r12.get(r3)
                    boolean r5 = r4 instanceof com.facebook.flipper.core.FlipperObject
                    r6 = 0
                    if (r5 == 0) goto L30
                    com.facebook.flipper.core.FlipperObject r4 = (com.facebook.flipper.core.FlipperObject) r4
                    java.lang.String r5 = "kind"
                    boolean r5 = r4.contains(r5)
                    if (r5 == 0) goto L30
                    com.facebook.flipper.plugins.inspector.SetDataOperations$HintedFlipperDynamic r12 = com.facebook.flipper.plugins.inspector.SetDataOperations.parseLayoutEditorMessage(r4)
                    com.facebook.flipper.plugins.inspector.SetDataOperations$FlipperValueHint r3 = r12.kind
                    com.facebook.flipper.core.FlipperDynamic r12 = r12.value
                    goto L35
                L30:
                    com.facebook.flipper.core.FlipperDynamic r12 = r12.getDynamic(r3)
                    r3 = r6
                L35:
                    com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin r4 = com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.this
                    com.facebook.flipper.plugins.inspector.ObjectTracker r4 = com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.access$100(r4)
                    java.lang.Object r4 = r4.get(r0)
                    if (r4 != 0) goto L42
                    return
                L42:
                    com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin r5 = com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.this
                    com.facebook.flipper.plugins.inspector.NodeDescriptor r5 = r5.descriptorForObject(r4)
                    if (r5 != 0) goto L4b
                    return
                L4b:
                    int r7 = r2.length()
                    java.lang.String[] r8 = new java.lang.String[r7]
                    r9 = 0
                L52:
                    if (r9 >= r7) goto L5d
                    java.lang.String r10 = r2.getString(r9)
                    r8[r9] = r10
                    int r9 = r9 + 1
                    goto L52
                L5d:
                    r5.setValue(r4, r8, r3, r12)
                    if (r1 == 0) goto L68
                    com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin r12 = com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.this
                    com.facebook.flipper.core.FlipperObject r6 = com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.access$500(r12, r0)
                L68:
                    r13.success(r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.AnonymousClass9.onReceiveOnMainThread(com.facebook.flipper.core.FlipperObject, com.facebook.flipper.core.FlipperResponder):void");
            }
        };
        this.mSetHighlighted = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.10
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                String string = flipperObject.getString("id");
                boolean z = flipperObject.getBoolean("isAlignmentMode");
                if (InspectorFlipperPlugin.this.mHighlightedId != null) {
                    InspectorFlipperPlugin inspectorFlipperPlugin = InspectorFlipperPlugin.this;
                    inspectorFlipperPlugin.setHighlighted(inspectorFlipperPlugin.mHighlightedId, false, z);
                }
                if (string != null) {
                    InspectorFlipperPlugin.this.setHighlighted(string, true, z);
                }
                InspectorFlipperPlugin.this.mHighlightedId = string;
                InspectorFlipperPlugin.this.mHighlightedAlignmentMode = z;
                flipperResponder.success();
            }
        };
        this.mGetSnapshot = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.11
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                Bitmap snapshot;
                String string = flipperObject.getString("id");
                if (InspectorFlipperPlugin.this.mHighlightedId != null) {
                    InspectorFlipperPlugin inspectorFlipperPlugin = InspectorFlipperPlugin.this;
                    inspectorFlipperPlugin.setHighlighted(inspectorFlipperPlugin.mHighlightedId, false, false);
                }
                try {
                    try {
                        snapshot = InspectorFlipperPlugin.this.getSnapshot(string, true);
                    } catch (Exception unused) {
                        flipperResponder.error(new FlipperObject.Builder().put("error", "unable to obtain snapshpt for object").put("id", string).build());
                        if (InspectorFlipperPlugin.this.mHighlightedId == null) {
                            return;
                        }
                    }
                    if (snapshot != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        snapshot.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        flipperResponder.success(new FlipperObject.Builder().put("id", string).put("snapshot", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).build());
                        if (InspectorFlipperPlugin.this.mHighlightedId == null) {
                            return;
                        }
                        InspectorFlipperPlugin inspectorFlipperPlugin2 = InspectorFlipperPlugin.this;
                        inspectorFlipperPlugin2.setHighlighted(inspectorFlipperPlugin2.mHighlightedId, true, InspectorFlipperPlugin.this.mHighlightedAlignmentMode);
                        return;
                    }
                    throw new Exception("An error occurred whilst trying to encode snapshot");
                } catch (Throwable th) {
                    if (InspectorFlipperPlugin.this.mHighlightedId != null) {
                        InspectorFlipperPlugin inspectorFlipperPlugin3 = InspectorFlipperPlugin.this;
                        inspectorFlipperPlugin3.setHighlighted(inspectorFlipperPlugin3.mHighlightedId, true, InspectorFlipperPlugin.this.mHighlightedAlignmentMode);
                    }
                    throw th;
                }
            }
        };
        this.mSetSearchActive = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.12
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                ViewGroup viewGroup;
                boolean z = flipperObject.getBoolean("active");
                ApplicationDescriptor.setSearchActive(z);
                List<View> viewRoots = InspectorFlipperPlugin.this.mApplication.getViewRoots();
                int size = viewRoots.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (viewRoots.get(size) instanceof ViewGroup) {
                            viewGroup = (ViewGroup) viewRoots.get(size);
                            break;
                        }
                    } else {
                        viewGroup = null;
                        break;
                    }
                }
                if (viewGroup != null) {
                    if (z) {
                        InspectorFlipperPlugin.this.mTouchOverlay = new TouchOverlayView(viewGroup.getContext(), InspectorFlipperPlugin.this.mConnection, InspectorFlipperPlugin.this.mApplication) { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.12.1
                            @Override // com.facebook.flipper.plugins.inspector.TouchOverlayView
                            protected NodeDescriptor<Object> descriptorForObject(Object obj) {
                                return InspectorFlipperPlugin.this.descriptorForObject(obj);
                            }

                            @Override // com.facebook.flipper.plugins.inspector.TouchOverlayView
                            protected String trackObject(Object obj) throws Exception {
                                return InspectorFlipperPlugin.this.trackObject(obj);
                            }
                        };
                        viewGroup.addView(InspectorFlipperPlugin.this.mTouchOverlay);
                        viewGroup.bringChildToFront(InspectorFlipperPlugin.this.mTouchOverlay);
                        return;
                    }
                    viewGroup.removeView(InspectorFlipperPlugin.this.mTouchOverlay);
                    InspectorFlipperPlugin.this.mTouchOverlay = null;
                }
            }
        };
        this.mIsSearchActive = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.13
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                flipperResponder.success(new FlipperObject.Builder().put("isSearchActive", Boolean.valueOf(ApplicationDescriptor.getSearchActive())).build());
            }
        };
        this.mGetSearchResults = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.14
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                FlipperObject flipperObject2;
                String string = flipperObject.getString(SearchIntents.EXTRA_QUERY);
                SearchResultNode searchTree = InspectorFlipperPlugin.this.searchTree(string.toLowerCase(), InspectorFlipperPlugin.this.mApplication, flipperObject.getBoolean("axEnabled"));
                if (searchTree == null) {
                    flipperObject2 = null;
                } else {
                    flipperObject2 = searchTree.toFlipperObject();
                }
                flipperResponder.success(new FlipperObject.Builder().put("results", flipperObject2).put(SearchIntents.EXTRA_QUERY, string).build());
            }
        };
        this.mSetResolvedPath = new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.15
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                InspectorFlipperPlugin.this.resolvedPaths.put(flipperObject.getString("className"), flipperObject.getString("resolvedPath"));
            }
        };
        this.mDescriptorMapping = descriptorMapping;
        this.mObjectTracker = new ObjectTracker();
        this.mApplication = applicationWrapper;
        this.mExtensionCommands = list;
        this.mShowLithoAccessibilitySettings = false;
        applicationWrapper.setActivityDestroyedListener(new ApplicationWrapper.ActivityDestroyedListener() { // from class: com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin.1
            private final DescriptorMapping mCallbackDescriptorMapping;
            private final ObjectTracker mCallbackObjectTracker;

            {
                this.mCallbackDescriptorMapping = InspectorFlipperPlugin.this.mDescriptorMapping;
                this.mCallbackObjectTracker = InspectorFlipperPlugin.this.mObjectTracker;
            }

            @Override // com.facebook.flipper.plugins.inspector.ApplicationWrapper.ActivityDestroyedListener
            public void onActivityDestroyed(Activity activity) {
                try {
                    NodeDescriptor<?> descriptorForClass = this.mCallbackDescriptorMapping.descriptorForClass(Activity.class);
                    if (descriptorForClass != null && this.mCallbackObjectTracker != null) {
                        this.mCallbackObjectTracker.remove(descriptorForClass.getId(activity));
                    }
                } catch (Exception e) {
                    Log.d(InspectorFlipperPlugin.TAG, "Cannot remove activity from ObjectTracker: " + e.getMessage());
                }
            }
        });
    }
}
