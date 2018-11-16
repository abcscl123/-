package com.ldz.database.userdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.userdao.CollectionDao;
import com.ldz.database.userdao.NoteDao;
import com.ldz.model.user.Collection;
import com.ldz.model.user.Note;

@Repository
public class NoteDaoImpl extends BaseDaoImpl implements NoteDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Note.class;
	}
	
}
