/**
 * This class is generated by jOOQ
 */
package org.jooq.util.repos;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.util.repos.tables.TabJobTest;
import org.jooq.util.repos.tables.records.TabJobTestRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>esjob</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<TabJobTestRecord, Integer> IDENTITY_TAB_JOB_TEST = Identities0.IDENTITY_TAB_JOB_TEST;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<TabJobTestRecord> KEY_TAB_JOB_TEST_PRIMARY = UniqueKeys0.KEY_TAB_JOB_TEST_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<TabJobTestRecord, Integer> IDENTITY_TAB_JOB_TEST = createIdentity(TabJobTest.TAB_JOB_TEST, TabJobTest.TAB_JOB_TEST.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<TabJobTestRecord> KEY_TAB_JOB_TEST_PRIMARY = createUniqueKey(TabJobTest.TAB_JOB_TEST, TabJobTest.TAB_JOB_TEST.ID);
	}
}
