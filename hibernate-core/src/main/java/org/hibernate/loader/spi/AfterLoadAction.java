/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.loader.spi;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.persister.entity.Loadable;

/**
* @author Steve Ebersole
*/
public interface AfterLoadAction {
	public void afterLoad(SessionImplementor session, Object entity, Loadable persister);
}
