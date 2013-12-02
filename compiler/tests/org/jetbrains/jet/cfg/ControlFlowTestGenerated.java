/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.cfg;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.cfg.AbstractControlFlowTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/cfg")
public class ControlFlowTestGenerated extends AbstractControlFlowTest {
    public void testAllFilesPresentInCfg() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/cfg"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("AnonymousInitializers.kt")
    public void testAnonymousInitializers() throws Exception {
        doTest("compiler/testData/cfg/AnonymousInitializers.kt");
    }
    
    @TestMetadata("ArrayAccess.kt")
    public void testArrayAccess() throws Exception {
        doTest("compiler/testData/cfg/ArrayAccess.kt");
    }
    
    @TestMetadata("arrayAccessExpression.kt")
    public void testArrayAccessExpression() throws Exception {
        doTest("compiler/testData/cfg/arrayAccessExpression.kt");
    }
    
    @TestMetadata("Assignments.kt")
    public void testAssignments() throws Exception {
        doTest("compiler/testData/cfg/Assignments.kt");
    }
    
    @TestMetadata("backingFieldAccess.kt")
    public void testBackingFieldAccess() throws Exception {
        doTest("compiler/testData/cfg/backingFieldAccess.kt");
    }
    
    @TestMetadata("Basic.kt")
    public void testBasic() throws Exception {
        doTest("compiler/testData/cfg/Basic.kt");
    }
    
    @TestMetadata("DeadCode.kt")
    public void testDeadCode() throws Exception {
        doTest("compiler/testData/cfg/DeadCode.kt");
    }
    
    @TestMetadata("DelegatedProperty.kt")
    public void testDelegatedProperty() throws Exception {
        doTest("compiler/testData/cfg/DelegatedProperty.kt");
    }
    
    @TestMetadata("EmptyFunction.kt")
    public void testEmptyFunction() throws Exception {
        doTest("compiler/testData/cfg/EmptyFunction.kt");
    }
    
    @TestMetadata("FailFunction.kt")
    public void testFailFunction() throws Exception {
        doTest("compiler/testData/cfg/FailFunction.kt");
    }
    
    @TestMetadata("Finally.kt")
    public void testFinally() throws Exception {
        doTest("compiler/testData/cfg/Finally.kt");
    }
    
    @TestMetadata("FinallyTestCopy.kt")
    public void testFinallyTestCopy() throws Exception {
        doTest("compiler/testData/cfg/FinallyTestCopy.kt");
    }
    
    @TestMetadata("For.kt")
    public void testFor() throws Exception {
        doTest("compiler/testData/cfg/For.kt");
    }
    
    @TestMetadata("If.kt")
    public void testIf() throws Exception {
        doTest("compiler/testData/cfg/If.kt");
    }
    
    @TestMetadata("incrementAtTheEnd.kt")
    public void testIncrementAtTheEnd() throws Exception {
        doTest("compiler/testData/cfg/incrementAtTheEnd.kt");
    }
    
    @TestMetadata("invoke.kt")
    public void testInvoke() throws Exception {
        doTest("compiler/testData/cfg/invoke.kt");
    }
    
    @TestMetadata("LazyBooleans.kt")
    public void testLazyBooleans() throws Exception {
        doTest("compiler/testData/cfg/LazyBooleans.kt");
    }
    
    @TestMetadata("LocalDeclarations.kt")
    public void testLocalDeclarations() throws Exception {
        doTest("compiler/testData/cfg/LocalDeclarations.kt");
    }
    
    @TestMetadata("MultiDecl.kt")
    public void testMultiDecl() throws Exception {
        doTest("compiler/testData/cfg/MultiDecl.kt");
    }
    
    @TestMetadata("multiDeclarationWithError.kt")
    public void testMultiDeclarationWithError() throws Exception {
        doTest("compiler/testData/cfg/multiDeclarationWithError.kt");
    }
    
    @TestMetadata("ObjectExpression.kt")
    public void testObjectExpression() throws Exception {
        doTest("compiler/testData/cfg/ObjectExpression.kt");
    }
    
    @TestMetadata("OnlyWhileInFunctionBody.kt")
    public void testOnlyWhileInFunctionBody() throws Exception {
        doTest("compiler/testData/cfg/OnlyWhileInFunctionBody.kt");
    }
    
    @TestMetadata("propertySafeCall.kt")
    public void testPropertySafeCall() throws Exception {
        doTest("compiler/testData/cfg/propertySafeCall.kt");
    }
    
    @TestMetadata("ReturnFromExpression.kt")
    public void testReturnFromExpression() throws Exception {
        doTest("compiler/testData/cfg/ReturnFromExpression.kt");
    }
    
    @TestMetadata("ShortFunction.kt")
    public void testShortFunction() throws Exception {
        doTest("compiler/testData/cfg/ShortFunction.kt");
    }
    
}
