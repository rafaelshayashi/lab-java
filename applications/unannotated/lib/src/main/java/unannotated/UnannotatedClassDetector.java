package unannotated;

import edu.umd.cs.findbugs.BugInstance;
import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;
import org.apache.bcel.classfile.*;

import java.util.Objects;

public class UnannotatedClassDetector implements Detector {
    private final BugReporter bugReporter;

    public UnannotatedClassDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        boolean isDetected = false;
        JavaClass javaClass = classContext.getJavaClass();
        for (Field field : javaClass.getFields()) {
            ConstantPool constantPool = field.getConstantPool();
            Constant[] constants = constantPool.getConstantPool();
            for (Constant constant : constants) {
                if (Objects.isNull(constant)) {
                    continue;
                }
                if (constant.toString().equals("CONSTANT_Utf8[1](\"Ljakarta/validation/constraints/NotEmpty;\")")) {
                    isDetected = true;
                }
            }
        }
        if (!isDetected) {
            BugInstance bug = new BugInstance(this, "MY_BUG", NORMAL_PRIORITY)
                    .addClass(javaClass);
            bugReporter.reportBug(bug);
        }
    }

    @Override
    public void report() {

    }
}
