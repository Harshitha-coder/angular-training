import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

// const httpOptions = {
//   headers: new HttpHeaders({
//     'Content-Type':  'application/json',
//     Authorization: 'my-auth-token'
//   })
// };
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
 public baseUrl="http://localhost:8080/getAll";
 public baseUrl1="http://localhost:8080/save";
public baseUrl2="http://localhost:8080/delete";
public baseUrl3="http://localhost:8080/update";
  constructor(private httpClinet:HttpClient) { }

  getUsers()
  {
    return this.httpClinet.get(this.baseUrl);
  }


  addUser(user:User[]): Observable<User[]> {
    return this.httpClinet.post<User[]>(this.baseUrl1,user);
  }

  deleteUser(id:number):Observable<User>
  {
    return this.httpClinet.delete<User>(`${this.baseUrl2}/${id}`);
  }

  UpdateUser(user:User,id:number):Observable<User>
  {
    return this.httpClinet.put<User>(`${this.baseUrl3}/${id}`,user);
  }
}
