package testbase;

import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import uk.ac.manchester.cs.jfact.JFactFactory;

@SuppressWarnings("javadoc")
public class TestBase {

    protected static OWLReasonerFactory factory() {
        return new JFactFactory();
    }
}
