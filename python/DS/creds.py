#!/usr/bin/python3


import hashlib



string = b"J82bcn^bi%2bdwHF" 

sha256 = hashlib.sha256()

print(sha256)

sha256.update(string)

string_hash = sha256.hexdigest()

print(f"Hash:{string_hash}")
