/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jrmouro.gitmining.Commit;
import com.jrmouro.gitmining.Mining;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronaldo
 */
public class CommitJUnitTest {

    public CommitJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() throws IOException, InterruptedException, ParseException {
        Path path = Mining.getPath("temp");
        Commit.gitCommitList(path, true).forEach((t) -> {
            System.out.println(t.hash);
            t.parents.forEach((rt) -> {
                System.out.println("\t"+rt);
            });
        });
    }
}
