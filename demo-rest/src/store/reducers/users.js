import { SET_USERS } from "../../constants/actions"
import { initialState } from "../../constants/initialState"

export const users = (state = initialState.users, {payload, type}) => {
	switch(type) {
		case SET_USERS: {
			return {...state, list: payload}
		}
		default: {
			return state;
		}
	}
}